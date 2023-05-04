package com.jamiltonquintero.company.service;


import com.jamiltonquintero.company.CompanyToCompanyDto;
import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.model.dto.CompanyDto;
import com.jamiltonquintero.company.port.dao.CompanyDao;

import java.util.Optional;

public class CompanyByEmailService {

    private final CompanyDao companyDao;

    public CompanyByEmailService(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public CompanyDto execute(String email){

        Optional<Company> company = companyDao.getByEmail(email);

        if(!company.isPresent()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return CompanyToCompanyDto.execute(company.get());

    }


}
