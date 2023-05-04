package com.jamiltonquintero.company.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CompanyDto {

    private Long id;
    private String name;
    private String email;

}
