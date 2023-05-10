package com.jamiltonquintero.companyconfiguration.subreward.command.handler;

import com.jamiltonquintero.companyconfiguration.subreward.command.SubRewardRegisterCommand;
import com.jamiltonquintero.companyconfiguration.subreward.command.factory.SubRewardFactory;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardRegisterService;
import org.springframework.stereotype.Component;

@Component
public class SubRewardRegisterHandler {

    private final SubRewardRegisterService subRewardRegisterService;
    private final SubRewardFactory subRewardFactory;

    public SubRewardRegisterHandler(SubRewardRegisterService subRewardRegisterService, SubRewardFactory subRewardFactory) {
        this.subRewardRegisterService = subRewardRegisterService;
        this.subRewardFactory = subRewardFactory;
    }

    public Long execute(SubRewardRegisterCommand command, Long companyId){
        return subRewardRegisterService
                .execute(subRewardFactory.execute(command), companyId);
    }

}
