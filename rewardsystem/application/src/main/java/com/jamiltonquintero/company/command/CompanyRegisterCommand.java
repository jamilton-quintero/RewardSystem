package com.jamiltonquintero.company.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CompanyRegisterCommand {

    private String name;
    private String email;
    private String password;

}
