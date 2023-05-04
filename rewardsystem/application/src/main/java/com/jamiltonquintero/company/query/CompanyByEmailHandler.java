package com.jamiltonquintero.company.query;

import com.jamiltonquintero.company.model.dto.CompanyDto;
import com.jamiltonquintero.company.service.CompanyByEmailService;
import org.springframework.stereotype.Component;

@Component
public class CompanyByEmailHandler {

    private final CompanyByEmailService companyByEmailService;
    public CompanyByEmailHandler(CompanyByEmailService companyByEmailService) {
        this.companyByEmailService = companyByEmailService;
    }

    public CompanyDto execute(String email){
        return companyByEmailService
                .execute(email);
    }

}
