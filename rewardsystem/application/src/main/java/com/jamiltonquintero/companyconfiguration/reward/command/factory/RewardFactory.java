package com.jamiltonquintero.companyconfiguration.reward.command.factory;

import com.jamiltonquintero.companyconfiguration.reward.command.RewardEditCommand;
import com.jamiltonquintero.companyconfiguration.reward.command.RewardRegisterCommand;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardToCreate;
import org.springframework.stereotype.Component;

@Component
public class RewardFactory {

    public RewardToCreate execute(RewardRegisterCommand command){

        return new RewardToCreate(
                command.getPointsToRedeem(),
                command.getAvailableRewards(),
                command.getDailyPointsLimit(),
                command.getWeeklyPointsLimit(),
                command.getPointsAccumulatedMessage(),
                command.getRedemptionMessage(),
                command.getPointsRange(),
                command.getExpirationDate());
    }

    public Reward execute(RewardEditCommand command){

        return new Reward(
                command.getPointsToRedeem(),
                command.getAvailableRewards(),
                command.getDailyPointsLimit(),
                command.getWeeklyPointsLimit(),
                command.getPointsAccumulatedMessage(),
                command.getRedemptionMessage(),
                command.getPointsRange(),
                command.getExpirationDate());
    }

}
