package com.jamiltonquintero.beanconfiguration;

import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.company.port.repository.CompanyRepository;
import com.jamiltonquintero.company.service.CompanyByEmailService;
import com.jamiltonquintero.company.service.CompanyByIdService;
import com.jamiltonquintero.company.service.CompanyRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyBean {

    @Bean
    public CompanyByEmailService companyByEmailService(CompanyDao companyDao){
        return new CompanyByEmailService(companyDao);
    }

    @Bean
    public CompanyByIdService companyByIdService(CompanyDao companyDao){
        return new CompanyByIdService(companyDao);
    }
    @Bean
    public CompanyRegisterService companyRegisterService(CompanyRepository companyRepository){
        return new CompanyRegisterService(companyRepository);
    }

}
