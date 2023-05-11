package com.jamiltonquintero.companyconfiguration.subreward.adapter.entity;

import com.jamiltonquintero.company.adapter.entity.CompanyEntity;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
    private Set<RewardEntity> rewards;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private CompanyEntity company;


    public SubRewardEntity(Integer pointsToRedeem, String name, CompanyEntity company) {
        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
        this.company = company;
    }

    public SubRewardEntity(Long id, Integer pointsToRedeem, String name, CompanyEntity company) {
        this.id = id;
        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
        this.company = company;
    }

}