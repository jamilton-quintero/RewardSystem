package com.jamiltonquintero.companyconfiguration.reward.service;

import com.jamiltonquintero.companyconfiguration.reward.RewardToRewardDto;
import com.jamiltonquintero.companyconfiguration.reward.model.dto.RewardDto;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.port.dao.RewardDao;

import java.util.List;
import java.util.stream.Collectors;

public class RewardAllByCompanyService {

    private final RewardDao rewardDao;

    public RewardAllByCompanyService(RewardDao rewardDao) {
        this.rewardDao = rewardDao;
    }

    public List<RewardDto> execute(Long companyId){

        List<Reward> rewards = rewardDao.getAllByCompany(companyId);

        if(rewards.isEmpty()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return rewards
                .stream()
                .map(RewardToRewardDto::execute)
                .collect(Collectors.toList());

    }
}
