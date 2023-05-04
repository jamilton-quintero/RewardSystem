package com.jamiltonquintero.companyconfiguration.controller;

import com.jamiltonquintero.companyconfiguration.model.dto.CompanyConfigurationDto;
import com.jamiltonquintero.companyconfiguration.query.AllCompanyConfigurationByCompanyHandler;
import com.jamiltonquintero.companyconfiguration.query.CompanyConfigurationByCompanyHandler;
import com.jamiltonquintero.companyconfiguration.query.CompanyConfigurationrByIdHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/configurations")
public class CompanyConfigurationQueryController {

    private final CompanyConfigurationrByIdHandler companyConfigurationrByIdHandler;
    private final CompanyConfigurationByCompanyHandler companyConfigurationByCompanyHandler;
    private final AllCompanyConfigurationByCompanyHandler allCompanyConfigurationByCompanyHandler;
    public CompanyConfigurationQueryController(CompanyConfigurationrByIdHandler companyConfigurationrByIdHandler,
                                               CompanyConfigurationByCompanyHandler companyConfigurationByCompanyHandler,
                                               AllCompanyConfigurationByCompanyHandler allCompanyConfigurationByCompanyHandler) {
        this.companyConfigurationrByIdHandler = companyConfigurationrByIdHandler;
        this.companyConfigurationByCompanyHandler = companyConfigurationByCompanyHandler;
        this.allCompanyConfigurationByCompanyHandler = allCompanyConfigurationByCompanyHandler;
    }

    @GetMapping("/{id}")
    public CompanyConfigurationDto getById(@PathVariable long id){
        return companyConfigurationrByIdHandler.execute(id);
    }

    @GetMapping("/companies/{companyId}")
    public List<CompanyConfigurationDto> getAllByCompany(@PathVariable long companyId){
        return allCompanyConfigurationByCompanyHandler.execute(companyId);
    }

}
