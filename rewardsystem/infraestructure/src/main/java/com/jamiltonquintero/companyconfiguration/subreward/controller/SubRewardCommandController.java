package com.jamiltonquintero.companyconfiguration.subreward.controller;

import com.jamiltonquintero.companyconfiguration.subreward.command.SubRewardEditCommand;
import com.jamiltonquintero.companyconfiguration.subreward.command.SubRewardRegisterCommand;
import com.jamiltonquintero.companyconfiguration.subreward.command.handler.SubRewardDeleteHandler;
import com.jamiltonquintero.companyconfiguration.subreward.command.handler.SubRewardEditHandler;
import com.jamiltonquintero.companyconfiguration.subreward.command.handler.SubRewardRegisterHandler;
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
@RequestMapping("/sub-rewards")
public class SubRewardCommandController {

    private final SubRewardRegisterHandler subRewardRegisterHandler;
    private final SubRewardEditHandler subRewardEditHandler;
    private final SubRewardDeleteHandler subRewardDeleteHandler;

    public SubRewardCommandController(SubRewardRegisterHandler subRewardRegisterHandler,
                                      SubRewardEditHandler subRewardEditHandler,
                                      SubRewardDeleteHandler subRewardDeleteHandler) {
        this.subRewardRegisterHandler = subRewardRegisterHandler;
        this.subRewardEditHandler = subRewardEditHandler;
        this.subRewardDeleteHandler = subRewardDeleteHandler;
    }

    @PostMapping("/companies/{companyId}")
    public Long registerByCompany(@RequestBody SubRewardRegisterCommand command, @PathVariable Long companyId){
        return subRewardRegisterHandler.execute(command, companyId);
    }

    @PutMapping("/{id}")
    public void edit(@RequestBody SubRewardEditCommand command,
                         @PathVariable Long id){
        subRewardEditHandler.execute(command, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        subRewardDeleteHandler.execute(id);
    }


}
