package com.jamiltonquintero.company.service;


import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.port.repository.CompanyRepository;

public class CompanyRegisterService {

    private final CompanyRepository companyRepository;

    public CompanyRegisterService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Long execute(Company company){
        company.setDateOfCreation();
        return companyRepository.create(company);
    }

}
