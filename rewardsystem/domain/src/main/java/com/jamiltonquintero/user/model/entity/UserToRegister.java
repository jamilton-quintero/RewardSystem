package com.jamiltonquintero.user.model.entity;

import com.jamiltonquintero.company.model.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserToRegister {

    public static final int INITIAL_POINTS = 0;

    private String firstName;
    private String lastName;
    private String email;
    private String identification;
    private Integer totalPoints;
    private List<Company> companies;

    public UserToRegister(String firstName, String lastName, String email, String identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
        this.totalPoints = INITIAL_POINTS;
        this.companies = new ArrayList<>();
    }


}