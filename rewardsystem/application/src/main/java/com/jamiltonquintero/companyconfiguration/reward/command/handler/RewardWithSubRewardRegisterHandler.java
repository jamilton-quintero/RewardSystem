package com.jamiltonquintero.companyconfiguration.reward.command.handler;

import com.jamiltonquintero.companyconfiguration.reward.command.RewardRegisterCommand;
import com.jamiltonquintero.companyconfiguration.reward.command.factory.RewardFactory;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardToCreate;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardWithSubRewardToCreate;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardWithSubRewardRegisterService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RewardWithSubRewardRegisterHandler {

    private final RewardWithSubRewardRegisterService rewardRegisterService;
    private final RewardFactory rewardFactory;

    public RewardWithSubRewardRegisterHandler(RewardWithSubRewardRegisterService rewardRegisterService, RewardFactory rewardFactory) {
        this.rewardRegisterService = rewardRegisterService;
        this.rewardFactory = rewardFactory;
    }


    public Long execute(RewardRegisterCommand command, Long companyId, List<Long> subRewardsIds){
        RewardToCreate rewardToCreate = rewardFactory.execute(command);
        return rewardRegisterService
                .execute( new RewardWithSubRewardToCreate(rewardToCreate), companyId, subRewardsIds);
    }

}
