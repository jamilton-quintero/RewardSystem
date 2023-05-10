package com.jamiltonquintero.companyconfiguration.reward.command.handler;

import com.jamiltonquintero.companyconfiguration.reward.command.RewardRegisterCommand;
import com.jamiltonquintero.companyconfiguration.reward.command.factory.RewardFactory;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardRegisterService;
import org.springframework.stereotype.Component;

@Component
public class RewardRegisterHandler {

    private final RewardRegisterService companyconfigurationRegisterService;
    private final RewardFactory rewardFactory;

    public RewardRegisterHandler(RewardRegisterService companyconfigurationRegisterService,
                                 RewardFactory rewardFactory) {
        this.companyconfigurationRegisterService = companyconfigurationRegisterService;
        this.rewardFactory = rewardFactory;
    }

    public Long execute(RewardRegisterCommand command, Long companyId){
        return companyconfigurationRegisterService
                .execute(rewardFactory.execute(command), companyId);
    }

}
