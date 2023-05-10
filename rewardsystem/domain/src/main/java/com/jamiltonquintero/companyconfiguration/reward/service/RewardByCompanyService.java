package com.jamiltonquintero.companyconfiguration.reward.service;

import com.jamiltonquintero.companyconfiguration.reward.RewardToRewardDto;
import com.jamiltonquintero.companyconfiguration.reward.model.dto.RewardDto;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.port.dao.RewardDao;

import java.util.Optional;

public class RewardByCompanyService {

    private final RewardDao rewardDao;

    public RewardByCompanyService(RewardDao rewardDao) {
        this.rewardDao = rewardDao;
    }

    public RewardDto execute(Long companyId){

        Optional<Reward> companyConfiguration = rewardDao.getByCompany(companyId);

        if(!companyConfiguration.isPresent()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return RewardToRewardDto.execute(companyConfiguration.get());

    }
}
