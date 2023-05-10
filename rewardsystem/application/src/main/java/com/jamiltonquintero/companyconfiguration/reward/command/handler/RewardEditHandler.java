package com.jamiltonquintero.companyconfiguration.reward.command.handler;

import com.jamiltonquintero.companyconfiguration.reward.command.RewardEditCommand;
import com.jamiltonquintero.companyconfiguration.reward.command.factory.RewardFactory;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardEditService;
import org.springframework.stereotype.Component;

@Component
public class RewardEditHandler {

    private final RewardEditService rewardEditService;
    private final RewardFactory rewardFactory;

    public RewardEditHandler(RewardEditService rewardEditService,
                             RewardFactory rewardFactory) {
        this.rewardEditService = rewardEditService;
        this.rewardFactory = rewardFactory;
    }


    public void execute(RewardEditCommand command, Long companyId){
        rewardEditService
                .execute(rewardFactory.execute(command), companyId);
    }

}
