package com.jamiltonquintero.companyconfiguration.service;

import com.jamiltonquintero.companyconfiguration.CompanyConfigurationToCompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.model.dto.CompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfiguration;
import com.jamiltonquintero.companyconfiguration.port.dao.CompanyConfigurationDao;

import java.util.Optional;

public class CompanyConfigurationByIdService {

    private final CompanyConfigurationDao companyConfigurationDao;

    public CompanyConfigurationByIdService(CompanyConfigurationDao companyConfigurationDao) {
        this.companyConfigurationDao = companyConfigurationDao;
    }

    public CompanyConfigurationDto execute(Long id){

        Optional<CompanyConfiguration> companyConfiguration = companyConfigurationDao.getById(id);

        if(!companyConfiguration.isPresent()){
            throw new RuntimeException("agregar excepcion personal");
        }
        return CompanyConfigurationToCompanyConfigurationDto.execute(companyConfiguration.get());
    }
}
