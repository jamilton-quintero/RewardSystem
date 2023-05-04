package com.jamiltonquintero.companyconfiguration.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CompanyConfigurationRegisterCommand {

    private Integer pointsToRedeem;
    private String availableRewards;
    private Integer dailyPointsLimit;
    private Integer weeklyPointsLimit;
    private String pointsAccumulatedMessage;
    private String redemptionMessage;
    private Integer pointsRange;
    private LocalDate expirationDate;

}
