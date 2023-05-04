package com.jamiltonquintero.company.controller;

import com.jamiltonquintero.company.command.CompanyRegisterCommand;
import com.jamiltonquintero.company.command.handler.CompanyRegisterHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/companies")
public class CompanyCommandController {

    private final CompanyRegisterHandler companyRegisterHandler;

    public CompanyCommandController(CompanyRegisterHandler companyRegisterHandler) {
        this.companyRegisterHandler = companyRegisterHandler;
    }

    @PostMapping()
    public Long companyRegister(@RequestBody CompanyRegisterCommand companyRegisterCommand){
        return companyRegisterHandler
                .execute(companyRegisterCommand);
    }

}
