package com.jamiltonquintero.companyconfiguration.adapter.repository;

import com.jamiltonquintero.companyconfiguration.adapter.CompanyConfigurationJpaRepository;
import com.jamiltonquintero.companyconfiguration.adapter.entity.CompanyConfigurationEntity;
import com.jamiltonquintero.companyconfiguration.adapter.mapper.CompanyConfigurationDboMapper;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfigurationToCreate;
import com.jamiltonquintero.companyconfiguration.port.repository.CompanyConfigurationRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyConfigurationRepositoryImpl implements CompanyConfigurationRepository {

    private final CompanyConfigurationJpaRepository companyConfigurationJpaRepository;
    private final CompanyConfigurationDboMapper companyConfigurationDboMapper;
    public CompanyConfigurationRepositoryImpl(CompanyConfigurationJpaRepository companyConfigurationJpaRepository, CompanyConfigurationDboMapper companyConfigurationDboMapper) {
        this.companyConfigurationJpaRepository = companyConfigurationJpaRepository;
        this.companyConfigurationDboMapper = companyConfigurationDboMapper;
    }


    @Override
    public Long create(CompanyConfigurationToCreate configuration) {
        CompanyConfigurationEntity companyConfigurationDbo = companyConfigurationDboMapper.toDboCreate(configuration);
        CompanyConfigurationEntity createdConfiguration = companyConfigurationJpaRepository.save(companyConfigurationDbo);
        return createdConfiguration.getId();
    }
}
