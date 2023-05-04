package com.jamiltonquintero.companyconfiguration.service;

import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfigurationToCreate;
import com.jamiltonquintero.companyconfiguration.port.repository.CompanyConfigurationRepository;

import java.util.Optional;

public class CompanyConfigurationRegisterService {

    private final CompanyConfigurationRepository companyConfigurationRepository;
    private final CompanyDao companyDao;

    public CompanyConfigurationRegisterService(CompanyConfigurationRepository companyConfigurationRepository, CompanyDao companyDao) {
        this.companyConfigurationRepository = companyConfigurationRepository;
        this.companyDao = companyDao;
    }

    public Long execute(CompanyConfigurationToCreate companyConfiguration, Long companyId){

        Optional<Company> company = companyDao.getById(companyId);

        if (!company.isPresent()){
            throw new RuntimeException("");
        }

        companyConfiguration.addCompany(company.get());

        return companyConfigurationRepository.create(companyConfiguration);
    }
}
