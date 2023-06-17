package com.jamiltonquintero.companyconfiguration.reward.model.entity;

import com.jamiltonquintero.company.model.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RewardToCreate {

    @Setter
    private Integer pointsToRedeem;
    private String name;
    private Integer dailyPointsLimit;
    private Integer weeklyPointsLimit;
    private String pointsAccumulatedMessage;
    private String redemptionMessage;
    private Integer pointsRange;
    private LocalDate expirationDate;
    private Company company;

    public RewardToCreate(Integer pointsToRedeem,
                          String name,
                          Integer dailyPointsLimit,
                          Integer weeklyPointsLimit,
                          String pointsAccumulatedMessage,
                          String redemptionMessage,
                          Integer pointsRange,
                          LocalDate expirationDate) {

        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
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