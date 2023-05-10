package com.jamiltonquintero.companyconfiguration.subreward.model.entity;

import com.jamiltonquintero.company.model.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SubRewardToCreate {

    private Integer pointsToRedeem;
    private String name;


}