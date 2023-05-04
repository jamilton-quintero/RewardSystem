package com.jamiltonquintero.configuration;

import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.companyconfiguration.port.dao.CompanyConfigurationDao;
import com.jamiltonquintero.companyconfiguration.port.repository.CompanyConfigurationRepository;
import com.jamiltonquintero.companyconfiguration.service.AllCompanyConfigurationByCompanyService;
import com.jamiltonquintero.companyconfiguration.service.CompanyConfigurationByCompanyService;
import com.jamiltonquintero.companyconfiguration.service.CompanyConfigurationByIdService;
import com.jamiltonquintero.companyconfiguration.service.CompanyConfigurationRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyConfigurationBean {

    @Bean
    public CompanyConfigurationRegisterService companyConfigurationRegisterService(
            CompanyConfigurationRepository companyConfigurationRepository,
            CompanyDao companyDao){
        return new CompanyConfigurationRegisterService(companyConfigurationRepository, companyDao);
    }

    @Bean
    public CompanyConfigurationByIdService companyConfigurationByIdService(
            CompanyConfigurationDao companyConfigurationDao){
        return new CompanyConfigurationByIdService(companyConfigurationDao);
    }

    @Bean
    public CompanyConfigurationByCompanyService companyConfigurationByCompanyService(
            CompanyConfigurationDao companyConfigurationDao){
        return new CompanyConfigurationByCompanyService(companyConfigurationDao);
    }

    @Bean
    public AllCompanyConfigurationByCompanyService allCompanyConfigurationByCompanyService(
            CompanyConfigurationDao companyConfigurationDao){
        return new AllCompanyConfigurationByCompanyService(companyConfigurationDao);
    }

}
