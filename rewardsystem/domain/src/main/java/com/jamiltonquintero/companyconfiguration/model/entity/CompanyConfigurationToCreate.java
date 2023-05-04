package com.jamiltonquintero.companyconfiguration.model.entity;

import com.jamiltonquintero.company.model.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CompanyConfigurationToCreate {

    private Integer pointsToRedeem;
    private String availableRewards;
    private Integer dailyPointsLimit;
    private Integer weeklyPointsLimit;
    private String pointsAccumulatedMessage;
    private String redemptionMessage;
    private Integer pointsRange;
    private LocalDate expirationDate;
    private Company company;

    public CompanyConfigurationToCreate(Integer pointsToRedeem,
                                        String availableRewards,
                                        Integer dailyPointsLimit,
                                        Integer weeklyPointsLimit,
                                        String pointsAccumulatedMessage,
                                        String redemptionMessage,
                                        Integer pointsRange,
                                        LocalDate expirationDate) {

        this.pointsToRedeem = pointsToRedeem;
        this.availableRewards = availableRewards;
        this.dailyPointsLimit = dailyPointsLimit;
        this.weeklyPointsLimit = weeklyPointsLimit;
        this.pointsAccumulatedMessage = pointsAccumulatedMessage;
        this.redemptionMessage = redemptionMessage;
        this.pointsRange = pointsRange;
        this.expirationDate = expirationDate;

    }

    public void addCompany(Company company){
        this.company = company;
    }

}