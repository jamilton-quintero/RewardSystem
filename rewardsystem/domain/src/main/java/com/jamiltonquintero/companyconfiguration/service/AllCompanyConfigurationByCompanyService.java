package com.jamiltonquintero.companyconfiguration.service;

import com.jamiltonquintero.companyconfiguration.CompanyConfigurationToCompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.model.dto.CompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfiguration;
import com.jamiltonquintero.companyconfiguration.port.dao.CompanyConfigurationDao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AllCompanyConfigurationByCompanyService {

    private final CompanyConfigurationDao companyConfigurationDao;

    public AllCompanyConfigurationByCompanyService(CompanyConfigurationDao companyConfigurationDao) {
        this.companyConfigurationDao = companyConfigurationDao;
    }

    public List<CompanyConfigurationDto> execute(Long companyId){

        List<CompanyConfiguration> companyConfigurations = companyConfigurationDao.getAllByCompany(companyId);

        if(companyConfigurations.isEmpty()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return companyConfigurations
                .stream()
                .map(CompanyConfigurationToCompanyConfigurationDto::execute)
                .collect(Collectors.toList());

    }
}
