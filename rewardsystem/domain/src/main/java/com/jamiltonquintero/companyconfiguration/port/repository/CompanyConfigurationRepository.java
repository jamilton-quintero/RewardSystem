package com.jamiltonquintero.companyconfiguration.port.repository;


import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfigurationToCreate;

public interface CompanyConfigurationRepository {

    Long create(CompanyConfigurationToCreate configuration);

}
