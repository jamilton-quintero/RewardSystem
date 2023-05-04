package com.jamiltonquintero.company.query;

import com.jamiltonquintero.company.model.dto.CompanyDto;
import com.jamiltonquintero.company.service.CompanyByIdService;
import org.springframework.stereotype.Component;

@Component
public class CompanyByIdHandler {

    private final CompanyByIdService companyByIdService;

    public CompanyByIdHandler(CompanyByIdService companyByIdService) {
        this.companyByIdService = companyByIdService;
    }

    public CompanyDto execute(Long id){
        return companyByIdService
                .execute(id);
    }

}
