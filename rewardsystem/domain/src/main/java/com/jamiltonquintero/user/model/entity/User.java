package com.jamiltonquintero.user.model.entity;

import com.jamiltonquintero.company.model.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {

    public static final int INITIAL_POINTS = 0;

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String identification;
    private Integer totalPoints;
    private List<Company> companies;

    public User(String firstName, String lastName, String email, String identification, List<Company> companies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
        this.totalPoints = INITIAL_POINTS;
        this.companies = companies;
    }

    public User(String firstName, String lastName, String email, String identification,Integer totalPoints) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
        this.totalPoints = totalPoints;
    }



}