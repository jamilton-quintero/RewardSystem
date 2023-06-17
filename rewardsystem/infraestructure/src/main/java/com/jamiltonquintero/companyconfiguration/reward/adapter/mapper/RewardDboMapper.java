package com.jamiltonquintero.companyconfiguration.reward.adapter.mapper;

import com.jamiltonquintero.company.adapter.mapper.CompanyDboMapper;
import com.jamiltonquintero.companyconfiguration.reward.adapter.entity.RewardEntity;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardToCreate;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardWithSubRewardToCreate;
import com.jamiltonquintero.companyconfiguration.subreward.adapter.entity.SubRewardEntity;
import com.jamiltonquintero.companyconfiguration.subreward.adapter.mapper.SubRewardDboMapper;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class RewardDboMapper {

    private final CompanyDboMapper companyDboMapper;
    private final SubRewardDboMapper subRewardDboMapper;

    public RewardDboMapper(CompanyDboMapper companyDboMapper, SubRewardDboMapper subRewardDboMapper) {
        this.companyDboMapper = companyDboMapper;
        this.subRewardDboMapper = subRewardDboMapper;
    }

    public RewardEntity toDboCreate(RewardToCreate domain) {
        if (domain == null) {
            return null;
        }
        return new RewardEntity(
                domain.getPointsToRedeem(),
                domain.getName(),
                domain.getDailyPointsLimit(),
                domain.getWeeklyPointsLimit(),
                domain.getPointsAccumulatedMessage(),
                domain.getRedemptionMessage(),
                domain.getPointsRange(),
                domain.getExpirationDate(),
                companyDboMapper.toDbo(domain.getCompany()));
    }
    public RewardEntity toDboCreateWithSubRewards(RewardWithSubRewardToCreate domain) {
        if (domain == null) {
            return null;
        }

        Set<SubRewardEntity> subRewards = domain.getSubRewards().stream().map(subRewardDboMapper::toDbo)
                .collect(Collectors.toSet());

        return new RewardEntity(
                domain.getPointsToRedeem(),
                domain.getName(),
                domain.getDailyPointsLimit(),
                domain.getWeeklyPointsLimit(),
                domain.getPointsAccumulatedMessage(),
                domain.getRedemptionMessage(),
                domain.getPointsRange(),
                domain.getExpirationDate(),
                companyDboMapper.toDbo(domain.getCompany()),
                subRewards);
    }

    public RewardEntity toDbo(Reward domain) {
        if (domain == null) {
            return null;
        }
        return new RewardEntity(
                domain.getId(),
                domain.getPointsToRedeem(),
                domain.getName(),
                domain.isMultiReward(),
                domain.getDailyPointsLimit(),
                domain.getWeeklyPointsLimit(),
                domain.getPointsAccumulatedMessage(),
                domain.getRedemptionMessage(),
                domain.getPointsRange(),
                domain.getExpirationDate(),
                companyDboMapper.toDbo(domain.getCompany()),
                new HashSet<>(),
                new HashSet<>());
    }

    public Reward toDomain(RewardEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Reward(
                entity.getId(),
                entity.getPointsToRedeem(),
                entity.getName(),
                entity.isMultiReward(),
                entity.getDailyPointsLimit(),
                entity.getWeeklyPointsLimit(),
                entity.getPointsAccumulatedMessage(),
                entity.getRedemptionMessage(),
                entity.getPointsRange(),
                entity.getExpirationDate(),
                companyDboMapper.toDomain(entity.getCompany()));
    }

}