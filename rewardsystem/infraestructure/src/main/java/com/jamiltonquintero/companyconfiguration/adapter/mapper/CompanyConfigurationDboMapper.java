package com.jamiltonquintero.companyconfiguration.adapter.mapper;

import com.jamiltonquintero.company.adapter.mapper.CompanyDboMapper;
import com.jamiltonquintero.companyconfiguration.adapter.entity.CompanyConfigurationEntity;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfiguration;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfigurationToCreate;
import org.springframework.stereotype.Component;

@Component
public class CompanyConfigurationDboMapper {

    private final CompanyDboMapper companyDboMapper;

    public CompanyConfigurationDboMapper(CompanyDboMapper companyDboMapper) {
        this.companyDboMapper = companyDboMapper;
    }

    public CompanyConfigurationEntity toDboCreate(CompanyConfigurationToCreate domain) {
        if (domain == null) {
            return null;
        }
        return new CompanyConfigurationEntity(
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

    public CompanyConfiguration toDomain(CompanyConfigurationEntity entity) {
        if (entity == null) {
            return null;
        }
        return new CompanyConfiguration(
                entity.getId(),
                entity.getPointsToRedeem(),
                entity.getAvailableRewards(),
                entity.getDailyPointsLimit(),
                entity.getWeeklyPointsLimit(),
                entity.getPointsAccumulatedMessage(),
                entity.getRedemptionMessage(),
                entity.getPointsRange(),
                entity.getExpirationDate(),
                companyDboMapper.toDomain(entity.getCompany()));
    }

}