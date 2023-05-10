package com.jamiltonquintero.companyconfiguration.subreward;

import com.jamiltonquintero.companyconfiguration.subreward.model.dto.SubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;

public class SubRewardToSubRewardDto {

    public static SubRewardDto execute(SubReward subReward){
        return new SubRewardDto(
                subReward.getId(),
                subReward.getPointsToRedeem(),
                subReward.getName());
    }

}
