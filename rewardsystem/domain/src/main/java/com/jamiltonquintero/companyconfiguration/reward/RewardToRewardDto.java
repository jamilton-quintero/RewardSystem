package com.jamiltonquintero.companyconfiguration.reward;

import com.jamiltonquintero.companyconfiguration.reward.model.dto.RewardDto;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;

public class RewardToRewardDto {

    public static RewardDto execute(Reward reward){
        return new RewardDto(
                reward.getId(),
                reward.getPointsToRedeem(),
                reward.getName(),
                reward.isMultiReward(),
                reward.getDailyPointsLimit(),
                reward.getWeeklyPointsLimit(),
                reward.getPointsAccumulatedMessage(),
                reward.getRedemptionMessage(),
                reward.getPointsRange(),
                reward.getExpirationDate());
    }

}
