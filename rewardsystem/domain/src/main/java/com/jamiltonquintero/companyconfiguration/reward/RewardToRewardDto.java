package com.jamiltonquintero.companyconfiguration.reward;

import com.jamiltonquintero.companyconfiguration.reward.model.dto.RewardDto;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;

public class RewardToRewardDto {

    public static RewardDto execute(Reward configuration){
        return new RewardDto(
                configuration.getId(),
                configuration.getPointsToRedeem(),
                configuration.getAvailableRewards(),
                configuration.getDailyPointsLimit(),
                configuration.getWeeklyPointsLimit(),
                configuration.getPointsAccumulatedMessage(),
                configuration.getRedemptionMessage(),
                configuration.getPointsRange(),
                configuration.getExpirationDate());
    }

}
