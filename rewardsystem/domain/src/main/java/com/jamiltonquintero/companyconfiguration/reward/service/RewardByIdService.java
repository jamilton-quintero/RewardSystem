package com.jamiltonquintero.companyconfiguration.reward.service;

import com.jamiltonquintero.companyconfiguration.reward.RewardToRewardDto;
import com.jamiltonquintero.companyconfiguration.reward.model.dto.RewardDto;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.port.dao.RewardDao;

import java.util.Optional;

public class RewardByIdService {

    private final RewardDao rewardDao;

    public RewardByIdService(RewardDao rewardDao) {
        this.rewardDao = rewardDao;
    }

    public RewardDto execute(Long id){

        Optional<Reward> companyConfiguration = rewardDao.getById(id);

        if(!companyConfiguration.isPresent()){
            throw new RuntimeException("agregar excepcion personal");
        }
        return RewardToRewardDto.execute(companyConfiguration.get());
    }
}
