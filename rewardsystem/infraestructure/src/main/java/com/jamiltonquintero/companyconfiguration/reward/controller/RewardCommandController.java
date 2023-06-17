package com.jamiltonquintero.companyconfiguration.reward.controller;

import com.jamiltonquintero.companyconfiguration.reward.command.RewardEditCommand;
import com.jamiltonquintero.companyconfiguration.reward.command.RewardRegisterCommand;
import com.jamiltonquintero.companyconfiguration.reward.command.handler.RewardDeleteHandler;
import com.jamiltonquintero.companyconfiguration.reward.command.handler.RewardEditHandler;
import com.jamiltonquintero.companyconfiguration.reward.command.handler.RewardRegisterHandler;
import com.jamiltonquintero.companyconfiguration.reward.command.handler.RewardWithSubRewardRegisterHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rewards")
public class RewardCommandController {

    private final RewardRegisterHandler rewardRegisterHandler;
    private final RewardWithSubRewardRegisterHandler rewardWithSubRewardRegisterHandler;
    private final RewardEditHandler rewardEditHandler;
    private final RewardDeleteHandler rewardDeleteHandler;

    public RewardCommandController(RewardRegisterHandler rewardRegisterHandler,
                                   RewardWithSubRewardRegisterHandler rewardWithSubRewardRegisterHandler,
                                   RewardEditHandler rewardEditHandler,
                                   RewardDeleteHandler rewardDeleteHandler) {
        this.rewardRegisterHandler = rewardRegisterHandler;
        this.rewardWithSubRewardRegisterHandler = rewardWithSubRewardRegisterHandler;
        this.rewardEditHandler = rewardEditHandler;
        this.rewardDeleteHandler = rewardDeleteHandler;
    }

    @PostMapping("/companies/{companyId}")
    public Long registerByCompany(@RequestBody RewardRegisterCommand command, @PathVariable Long companyId){
        return rewardRegisterHandler.execute(command, companyId);
    }

    @PostMapping("/companies/{companyId}/sub-rewards")
    public Long registerByCompanyWithSubRewards(
            @RequestBody RewardRegisterCommand command,
            @PathVariable Long companyId,
            @RequestParam List<Long> subRewardsIds){
        return rewardWithSubRewardRegisterHandler.execute(command, companyId, subRewardsIds);
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



}
