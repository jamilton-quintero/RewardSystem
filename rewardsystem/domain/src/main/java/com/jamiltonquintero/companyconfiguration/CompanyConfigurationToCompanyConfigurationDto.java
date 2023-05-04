package com.jamiltonquintero.companyconfiguration;

import com.jamiltonquintero.companyconfiguration.model.dto.CompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfiguration;

public class CompanyConfigurationToCompanyConfigurationDto {

    public static CompanyConfigurationDto execute(CompanyConfiguration configuration){
        return new CompanyConfigurationDto(
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
