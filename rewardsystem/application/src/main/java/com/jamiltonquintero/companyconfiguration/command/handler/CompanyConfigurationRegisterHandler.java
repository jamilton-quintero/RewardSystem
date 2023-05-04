package com.jamiltonquintero.companyconfiguration.command.handler;

import com.jamiltonquintero.companyconfiguration.command.CompanyConfigurationRegisterCommand;
import com.jamiltonquintero.companyconfiguration.command.factory.CompanyConfigurationRegisterFactory;
import com.jamiltonquintero.companyconfiguration.service.CompanyConfigurationRegisterService;
import org.springframework.stereotype.Component;

@Component
public class CompanyConfigurationRegisterHandler {

    private final CompanyConfigurationRegisterService companyconfigurationRegisterService;
    private final CompanyConfigurationRegisterFactory companyConfigurationRegisterFactory;

    public CompanyConfigurationRegisterHandler(CompanyConfigurationRegisterService companyconfigurationRegisterService,
                                               CompanyConfigurationRegisterFactory companyConfigurationRegisterFactory) {
        this.companyconfigurationRegisterService = companyconfigurationRegisterService;
        this.companyConfigurationRegisterFactory = companyConfigurationRegisterFactory;
    }

    public Long execute(CompanyConfigurationRegisterCommand command, Long companyId){
        return companyconfigurationRegisterService
                .execute(companyConfigurationRegisterFactory.execute(command), companyId);
    }

}
