package com.jamiltonquintero.company.controller;

import com.jamiltonquintero.company.model.dto.CompanyDto;
import com.jamiltonquintero.company.query.CompanyByEmailHandler;
import com.jamiltonquintero.company.query.CompanyByIdHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/companies")
public class CompanyQueryController {

    private final CompanyByIdHandler companyByIdHandler;
    private final CompanyByEmailHandler companyByEmailHandler;

    public CompanyQueryController(CompanyByIdHandler companyByIdHandler, CompanyByEmailHandler companyByEmailHandler1) {
        this.companyByIdHandler = companyByIdHandler;
        this.companyByEmailHandler = companyByEmailHandler1;
    }

    @GetMapping("/{id}")
    public CompanyDto getCompanyById(@PathVariable Long id){
        return companyByIdHandler.execute(id);
    }

    @GetMapping(params = "email")
    public CompanyDto getCompanyByEmail(@RequestParam String email) {
        return companyByEmailHandler.execute(email);
    }

}
