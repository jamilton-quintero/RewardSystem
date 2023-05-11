package com.jamiltonquintero.companyconfiguration.reward.adapter.mapper;

import com.jamiltonquintero.company.adapter.mapper.CompanyDboMapper;
import com.jamiltonquintero.companyconfiguration.reward.adapter.entity.RewardEntity;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardToCreate;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class RewardDboMapper {

    private final CompanyDboMapper companyDboMapper;

    public RewardDboMapper(CompanyDboMapper companyDboMapper) {
        this.companyDboMapper = companyDboMapper;
    }

    public RewardEntity toDboCreate(RewardToCreate domain) {
        if (domain == null) {
            return null;
        }
        return new RewardEntity(
                domain.getPointsToRedeem(),
                domain.getAvailableRewards(),
                domain.getDailyPointsLimit(),
                domain.getWeeklyPointsLimit(),
                domain.getPointsAccumulatedMessage(),
                domain.getRedemptionMessage(),
                domain.getPointsRange(),
                domain.getExpirationDate(),
                companyDboMapper.toDbo(domain.getCompany()));
    }

    public RewardEntity toDbo(Reward domain) {
        if (domain == null) {
            return null;
        }
        return new RewardEntity(
                domain.getId(),
                domain.getPointsToRedeem(),
                domain.getAvailableRewards(),
                domain.getDailyPointsLimit(),
                domain.getWeeklyPointsLimit(),
                domain.getPointsAccumulatedMessage(),
                domain.getRedemptionMessage(),
                domain.getPointsRange(),
                domain.getExpirationDate(),
                companyDboMapper.toDbo(domain.getCompany()),
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
                entity.getDailyPointsLimit(),
                entity.getWeeklyPointsLimit(),
                entity.getPointsAccumulatedMessage(),
                entity.getRedemptionMessage(),
                entity.getPointsRange(),
                entity.getExpirationDate(),
                companyDboMapper.toDomain(entity.getCompany()));
    }

}