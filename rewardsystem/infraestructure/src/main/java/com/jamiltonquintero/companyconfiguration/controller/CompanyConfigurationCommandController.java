package com.jamiltonquintero.companyconfiguration.controller;

import com.jamiltonquintero.companyconfiguration.command.CompanyConfigurationRegisterCommand;
import com.jamiltonquintero.companyconfiguration.command.handler.CompanyConfigurationRegisterHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/configurations")
public class CompanyConfigurationCommandController {

    private final CompanyConfigurationRegisterHandler companyConfigurationRegisterHandler;

    public CompanyConfigurationCommandController(CompanyConfigurationRegisterHandler companyConfigurationRegisterHandler) {
        this.companyConfigurationRegisterHandler = companyConfigurationRegisterHandler;
    }

    @PostMapping("/companies/{companyId}")
    public Long register(@RequestBody CompanyConfigurationRegisterCommand command, @PathVariable Long companyId){
        return companyConfigurationRegisterHandler.execute(command, companyId);
    }

}
