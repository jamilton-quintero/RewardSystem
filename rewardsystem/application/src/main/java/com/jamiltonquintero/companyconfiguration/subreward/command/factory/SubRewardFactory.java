package com.jamiltonquintero.companyconfiguration.subreward.command.factory;

import com.jamiltonquintero.companyconfiguration.subreward.command.SubRewardEditCommand;
import com.jamiltonquintero.companyconfiguration.subreward.command.SubRewardRegisterCommand;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubRewardToCreate;
import org.springframework.stereotype.Component;

@Component
public class SubRewardFactory {

    public SubRewardToCreate execute(SubRewardRegisterCommand command){

        return new SubRewardToCreate(
                command.getPointsToRedeem(),
                command.getName());
    }

    public SubReward execute(SubRewardEditCommand command){

        return new SubReward(
                command.getPointsToRedeem(),
                command.getName());
    }


}
