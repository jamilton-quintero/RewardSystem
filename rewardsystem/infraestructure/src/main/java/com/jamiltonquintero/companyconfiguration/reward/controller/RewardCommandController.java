package com.jamiltonquintero.companyconfiguration.reward.controller;

import com.jamiltonquintero.companyconfiguration.reward.command.RewardEditCommand;
import com.jamiltonquintero.companyconfiguration.reward.command.RewardRegisterCommand;
import com.jamiltonquintero.companyconfiguration.reward.command.handler.RewardDeleteHandler;
import com.jamiltonquintero.companyconfiguration.reward.command.handler.RewardEditHandler;
import com.jamiltonquintero.companyconfiguration.reward.command.handler.RewardRegisterHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rewards")
public class RewardCommandController {

    private final RewardRegisterHandler rewardRegisterHandler;
    private final RewardEditHandler rewardEditHandler;
    private final RewardDeleteHandler rewardDeleteHandler;
    public RewardCommandController(RewardRegisterHandler rewardRegisterHandler, RewardEditHandler rewardEditHandler, RewardDeleteHandler rewardDeleteHandler) {
        this.rewardRegisterHandler = rewardRegisterHandler;
        this.rewardEditHandler = rewardEditHandler;
        this.rewardDeleteHandler = rewardDeleteHandler;
    }

    @PutMapping("/{id}")
    public void edit(@RequestBody RewardEditCommand command,
                         @PathVariable Long id){
        rewardEditHandler.execute(command, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        rewardDeleteHandler.execute(id);
    }


    @PostMapping("/companies/{companyId}")
    public Long registerByCompany(@RequestBody RewardRegisterCommand command, @PathVariable Long companyId){
        return rewardRegisterHandler.execute(command, companyId);
    }


}
