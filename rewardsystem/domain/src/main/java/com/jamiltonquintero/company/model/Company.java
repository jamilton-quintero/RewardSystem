package com.jamiltonquintero.company.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Company {

    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDate creationDate;

    public Company(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public  void setDateOfCreation(){
        this.creationDate = LocalDate.now();
    }
}