package com.jamiltonquintero.company.command.factory;

import com.jamiltonquintero.company.command.CompanyRegisterCommand;
import com.jamiltonquintero.company.model.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyRegisterFactory {

    public Company execute(CompanyRegisterCommand companyRegisterCommand){
        return new Company(companyRegisterCommand.getName(),companyRegisterCommand.getEmail(),companyRegisterCommand.getPassword());
    }

}
