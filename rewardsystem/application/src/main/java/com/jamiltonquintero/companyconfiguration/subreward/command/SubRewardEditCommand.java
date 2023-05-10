package com.jamiltonquintero.companyconfiguration.subreward.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SubRewardEditCommand {

    private Integer pointsToRedeem;
    private String name;

}
