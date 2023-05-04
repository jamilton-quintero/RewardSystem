package com.jamiltonquintero.companyconfiguration.service;

import com.jamiltonquintero.companyconfiguration.CompanyConfigurationToCompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.model.dto.CompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfiguration;
import com.jamiltonquintero.companyconfiguration.port.dao.CompanyConfigurationDao;

import java.util.Optional;

public class CompanyConfigurationByCompanyService {

    private final CompanyConfigurationDao companyConfigurationDao;

    public CompanyConfigurationByCompanyService(CompanyConfigurationDao companyConfigurationDao) {
        this.companyConfigurationDao = companyConfigurationDao;
    }

    public CompanyConfigurationDto execute(Long companyId){

        Optional<CompanyConfiguration> companyConfiguration = companyConfigurationDao.getByCompany(companyId);

        if(!companyConfiguration.isPresent()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return CompanyConfigurationToCompanyConfigurationDto.execute(companyConfiguration.get());

    }
}
