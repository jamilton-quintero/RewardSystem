package com.jamiltonquintero.companyconfiguration.reward.model.entity;

import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RewardWithSubRewardToCreate extends RewardToCreate{

    List<SubReward> subRewards;

    public void addRewards(List<SubReward> subRewards){
        this.subRewards = subRewards;
    }

    public RewardWithSubRewardToCreate(RewardToCreate rewardToCreate) {
        super(rewardToCreate.getPointsToRedeem(),
                rewardToCreate.getName(),
                rewardToCreate.getDailyPointsLimit(),
                rewardToCreate.getWeeklyPointsLimit(),
                rewardToCreate.getPointsAccumulatedMessage(),
                rewardToCreate.getRedemptionMessage(),
                rewardToCreate.getPointsRange(),
                rewardToCreate.getExpirationDate(),
                rewardToCreate.getCompany());
    }


}