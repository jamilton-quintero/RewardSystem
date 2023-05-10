package com.jamiltonquintero.companyconfiguration.subreward.command.handler;

import com.jamiltonquintero.companyconfiguration.reward.port.repository.RewardRepository;
import org.springframework.stereotype.Component;

@Component
public class SubRewardDeleteHandler {


    private final RewardRepository rewardRepository;

    public SubRewardDeleteHandler(RewardRepository rewardRepository) {
        this.rewardRepository = rewardRepository;
    }

    public void execute(Long Id){
        rewardRepository
                .delete(Id);
    }

}
