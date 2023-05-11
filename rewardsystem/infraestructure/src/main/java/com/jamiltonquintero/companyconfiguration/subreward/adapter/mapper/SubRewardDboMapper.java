package com.jamiltonquintero.companyconfiguration.subreward.adapter.mapper;

import com.jamiltonquintero.company.adapter.mapper.CompanyDboMapper;
import com.jamiltonquintero.companyconfiguration.subreward.adapter.entity.SubRewardEntity;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubRewardToCreate;
import org.springframework.stereotype.Component;

@Component
public class SubRewardDboMapper {

    private final CompanyDboMapper companyDboMapper;

    public SubRewardDboMapper(CompanyDboMapper companyDboMapper) {
        this.companyDboMapper = companyDboMapper;
    }

    public SubRewardEntity toDboCreate(SubRewardToCreate domain) {
        if (domain == null) {
            return null;
        }
        return new SubRewardEntity(
                domain.getPointsToRedeem(),
                domain.getName(),
                companyDboMapper.toDbo(domain.getCompany()));
    }

    public SubRewardEntity toDbo(SubReward domain) {
        if (domain == null) {
            return null;
        }
        return new SubRewardEntity(
                domain.getId(),
                domain.getPointsToRedeem(),
                domain.getName(),
                companyDboMapper.toDbo(domain.getCompany()));
    }

    public SubReward toDomain(SubRewardEntity entity) {
        if (entity == null) {
            return null;
        }
        return new SubReward(
                entity.getId(),
                entity.getPointsToRedeem(),
                entity.getName(),
                companyDboMapper.toDomain(entity.getCompany()));
    }

}