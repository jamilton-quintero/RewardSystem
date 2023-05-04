package com.jamiltonquintero.company.command.handler;

import com.jamiltonquintero.company.command.CompanyRegisterCommand;
import com.jamiltonquintero.company.command.factory.CompanyRegisterFactory;
import com.jamiltonquintero.company.service.CompanyRegisterService;
import org.springframework.stereotype.Component;

@Component
public class CompanyRegisterHandler {

    private final CompanyRegisterService companyRegisterService;
    private final CompanyRegisterFactory companyRegisterFactory;

    public CompanyRegisterHandler(CompanyRegisterService companyRegisterService, CompanyRegisterFactory companyRegisterFactory) {
        this.companyRegisterService = companyRegisterService;
        this.companyRegisterFactory = companyRegisterFactory;
    }

    public Long execute(CompanyRegisterCommand companyRegisterCommand){
        return companyRegisterService
                .execute(companyRegisterFactory.execute(companyRegisterCommand));
    }

}
