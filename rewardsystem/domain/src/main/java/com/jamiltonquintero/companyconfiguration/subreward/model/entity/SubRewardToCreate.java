package com.jamiltonquintero.companyconfiguration.subreward.model.entity;

import com.jamiltonquintero.company.model.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SubRewardToCreate {

    private Integer pointsToRedeem;
    private String name;
    private Company company;

    public SubRewardToCreate(Integer pointsToRedeem, String name) {
        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
    }

    public void addCompany(Company company){
        this.company = company;
    }

}