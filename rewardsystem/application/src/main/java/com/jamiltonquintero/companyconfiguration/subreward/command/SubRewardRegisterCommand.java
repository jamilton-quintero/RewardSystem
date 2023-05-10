package com.jamiltonquintero.companyconfiguration.subreward.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SubRewardRegisterCommand {

    private Integer pointsToRedeem;
    private String name;

}
