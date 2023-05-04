package com.jamiltonquintero.companyconfiguration.command.factory;

import com.jamiltonquintero.companyconfiguration.command.CompanyConfigurationRegisterCommand;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfigurationToCreate;
import org.springframework.stereotype.Component;

@Component
public class CompanyConfigurationRegisterFactory {

    public CompanyConfigurationToCreate execute(CompanyConfigurationRegisterCommand command){

        return new CompanyConfigurationToCreate(
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
