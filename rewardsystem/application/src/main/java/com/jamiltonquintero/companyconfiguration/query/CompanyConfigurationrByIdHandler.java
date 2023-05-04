package com.jamiltonquintero.companyconfiguration.query;

import com.jamiltonquintero.companyconfiguration.model.dto.CompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.service.CompanyConfigurationByIdService;
import org.springframework.stereotype.Component;

@Component
public class CompanyConfigurationrByIdHandler {

    private final CompanyConfigurationByIdService companyConfigurationByIdService;

    public CompanyConfigurationrByIdHandler(CompanyConfigurationByIdService companyConfigurationByIdService) {
        this.companyConfigurationByIdService = companyConfigurationByIdService;
    }

    public CompanyConfigurationDto execute(Long id){
        return companyConfigurationByIdService
                .execute(id);
    }

}
