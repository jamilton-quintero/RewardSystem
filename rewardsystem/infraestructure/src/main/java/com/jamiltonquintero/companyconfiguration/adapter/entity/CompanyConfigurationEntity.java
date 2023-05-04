package com.jamiltonquintero.companyconfiguration.adapter.entity;

import com.jamiltonquintero.company.adapter.entity.CompanyEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "company_configuration")
@Entity
public class CompanyConfigurationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "points_to_redeem")
    private Integer pointsToRedeem;
    @Column(name = "available_rewards")
    private String availableRewards;
    @Column(name = "daily_points_limit")
    private Integer dailyPointsLimit;
    @Column(name = "weekly_points_limit")
    private Integer weeklyPointsLimit;
    @Column(name = "points_accumulated_message")
    private String pointsAccumulatedMessage;
    @Column(name = "redemption_message")
    private String redemptionMessage;
    @Column(name = "points_range")
    private Integer pointsRange;
    @Column(name = "expiration_date")
    private LocalDate expirationDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private CompanyEntity company;

    public CompanyConfigurationEntity(Integer pointsToRedeem,
                                      String availableRewards,
                                      Integer dailyPointsLimit,
                                      Integer weeklyPointsLimit,
                                      String pointsAccumulatedMessage,
                                      String redemptionMessage,
                                      Integer pointsRange,
                                      LocalDate expirationDate,
                                      CompanyEntity company) {
        this.pointsToRedeem = pointsToRedeem;
        this.availableRewards = availableRewards;
        this.dailyPointsLimit = dailyPointsLimit;
        this.weeklyPointsLimit = weeklyPointsLimit;
        this.pointsAccumulatedMessage = pointsAccumulatedMessage;
        this.redemptionMessage = redemptionMessage;
        this.pointsRange = pointsRange;
        this.expirationDate = expirationDate;
        this.company = company;
    }
}