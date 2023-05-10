package com.jamiltonquintero.companyconfiguration.subreward.adapter.entity;

import com.jamiltonquintero.companyconfiguration.reward.adapter.entity.RewardEntity;
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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "sub_reward")
@Entity
public class SubRewardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "points_to_redeem")
    private Integer pointsToRedeem;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "subRewards", fetch = FetchType.LAZY)
    private Set<RewardEntity> configurations;


    public SubRewardEntity(Integer pointsToRedeem, String name) {
        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
    }

    public SubRewardEntity(Long id, Integer pointsToRedeem, String name) {
        this.id = id;
        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
    }
}