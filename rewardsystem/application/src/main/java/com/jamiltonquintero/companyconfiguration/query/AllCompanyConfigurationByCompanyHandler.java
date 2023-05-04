package com.jamiltonquintero.companyconfiguration.query;

import com.jamiltonquintero.companyconfiguration.model.dto.CompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.service.AllCompanyConfigurationByCompanyService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllCompanyConfigurationByCompanyHandler {

    private final AllCompanyConfigurationByCompanyService allCompanyConfigurationByCompanyService;

    public AllCompanyConfigurationByCompanyHandler(AllCompanyConfigurationByCompanyService allCompanyConfigurationByCompanyService) {
        this.allCompanyConfigurationByCompanyService = allCompanyConfigurationByCompanyService;
    }

    public List<CompanyConfigurationDto> execute(Long companyId){
        return allCompanyConfigurationByCompanyService
                .execute(companyId);
    }

}
