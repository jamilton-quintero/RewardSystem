package com.jamiltonquintero.companyconfiguration.reward.command.handler;

import com.jamiltonquintero.companyconfiguration.reward.command.RewardRegisterCommand;
import com.jamiltonquintero.companyconfiguration.reward.command.factory.RewardFactory;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardRegisterService;
import org.springframework.stereotype.Component;

@Component
public class RewardRegisterHandler {

    private final RewardRegisterService rewardRegisterService;
    private final RewardFactory rewardFactory;

    public RewardRegisterHandler(RewardRegisterService rewardRegisterService,
                                 RewardFactory rewardFactory) {
        this.rewardRegisterService = rewardRegisterService;
        this.rewardFactory = rewardFactory;
    }

    public Long execute(RewardRegisterCommand command, Long companyId){
        return rewardRegisterService
                .execute(rewardFactory.execute(command), companyId);
    }

}
