package com.jamiltonquintero.companyconfiguration.query;

import com.jamiltonquintero.companyconfiguration.model.dto.CompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.service.CompanyConfigurationByCompanyService;
import org.springframework.stereotype.Component;

@Component
public class CompanyConfigurationByCompanyHandler {

    private final CompanyConfigurationByCompanyService companyConfigurationByCompanyService;

    public CompanyConfigurationByCompanyHandler(CompanyConfigurationByCompanyService companyConfigurationByCompanyService) {
        this.companyConfigurationByCompanyService = companyConfigurationByCompanyService;
    }

    public CompanyConfigurationDto execute(Long companyId){
        return companyConfigurationByCompanyService
                .execute(companyId);
    }

}
