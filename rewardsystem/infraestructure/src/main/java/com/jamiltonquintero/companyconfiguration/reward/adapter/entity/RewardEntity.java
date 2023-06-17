package com.jamiltonquintero.companyconfiguration.reward.adapter.entity;

import com.jamiltonquintero.company.adapter.entity.CompanyEntity;
import com.jamiltonquintero.companyconfiguration.subreward.adapter.entity.SubRewardEntity;
import com.jamiltonquintero.user.adapter.entity.UserEntity;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "reward")
@Entity
public class RewardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "points_to_redeem")
    private Integer pointsToRedeem;
    @Column(name = "reward_name")
    private String name;
    @Column(name = "multi_rewards")
    private boolean multiReward;
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
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "reward_subreward",
            joinColumns = @JoinColumn(name = "reward_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "sub_reward_id", referencedColumnName = "id")
    )
    private Set<SubRewardEntity> subRewards;

    @ManyToMany(mappedBy = "rewards", fetch = FetchType.LAZY)
    private Set<UserEntity> users;

    public RewardEntity(Integer pointsToRedeem,
                        String name,
                        Integer dailyPointsLimit,
                        Integer weeklyPointsLimit,
                        String pointsAccumulatedMessage,
                        String redemptionMessage,
                        Integer pointsRange,
                        LocalDate expirationDate,
                        CompanyEntity company) {
        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
        this.dailyPointsLimit = dailyPointsLimit;
        this.weeklyPointsLimit = weeklyPointsLimit;
        this.pointsAccumulatedMessage = pointsAccumulatedMessage;
        this.redemptionMessage = redemptionMessage;
        this.pointsRange = pointsRange;
        this.expirationDate = expirationDate;
        this.company = company;
    }

    public RewardEntity(Integer pointsToRedeem,
                        String name,
                        Integer dailyPointsLimit,
                        Integer weeklyPointsLimit,
                        String pointsAccumulatedMessage,
                        String redemptionMessage,
                        Integer pointsRange,
                        LocalDate expirationDate,
                        CompanyEntity company,
                        Set<SubRewardEntity> subRewards) {

        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
        this.dailyPointsLimit = dailyPointsLimit;
        this.weeklyPointsLimit = weeklyPointsLimit;
        this.pointsAccumulatedMessage = pointsAccumulatedMessage;
        this.redemptionMessage = redemptionMessage;
        this.pointsRange = pointsRange;
        this.expirationDate = expirationDate;
        this.company = company;
        this.subRewards = subRewards;
        this.multiReward = true;
    }


}