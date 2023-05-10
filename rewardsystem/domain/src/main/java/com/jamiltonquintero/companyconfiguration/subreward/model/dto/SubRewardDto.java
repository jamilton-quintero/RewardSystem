package com.jamiltonquintero.companyconfiguration.subreward.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SubRewardDto {

    private Long id;
    private Integer pointsToRedeem;
    private String name;

}
