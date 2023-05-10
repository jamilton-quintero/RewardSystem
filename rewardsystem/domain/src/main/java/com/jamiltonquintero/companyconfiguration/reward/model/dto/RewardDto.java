package com.jamiltonquintero.companyconfiguration.reward.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RewardDto {

    private Long id;
    private Integer pointsToRedeem;
    private String availableRewards;
    private Integer dailyPointsLimit;
    private Integer weeklyPointsLimit;
    private String pointsAccumulatedMessage;
    private String redemptionMessage;
    private Integer pointsRange;
    private LocalDate expirationDate;

}
