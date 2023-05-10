package com.jamiltonquintero.companyconfiguration.subreward.command.handler;

import com.jamiltonquintero.companyconfiguration.subreward.command.SubRewardEditCommand;
import com.jamiltonquintero.companyconfiguration.subreward.command.factory.SubRewardFactory;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardEditService;
import org.springframework.stereotype.Component;

@Component
public class SubRewardEditHandler {

    private final SubRewardEditService subRewardEditService;
    private final SubRewardFactory subRewardFactory;

    public SubRewardEditHandler(SubRewardEditService subRewardEditService, SubRewardFactory subRewardFactory) {
        this.subRewardEditService = subRewardEditService;
        this.subRewardFactory = subRewardFactory;
    }

    public void execute(SubRewardEditCommand command, Long companyId){
        subRewardEditService
                .execute(subRewardFactory.execute(command), companyId);
    }

}
