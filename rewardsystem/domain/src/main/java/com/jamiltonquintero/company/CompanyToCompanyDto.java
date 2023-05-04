package com.jamiltonquintero.company;

import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.model.dto.CompanyDto;

public class CompanyToCompanyDto {

    public static CompanyDto execute(Company company){
        return new CompanyDto(
                company.getId(),
                company.getEmail(),
                company.getName());
    }

}
