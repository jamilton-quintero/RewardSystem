package com.jamiltonquintero.companyconfiguration.reward.service;

import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.port.dao.RewardDao;
import com.jamiltonquintero.companyconfiguration.reward.port.repository.RewardRepository;

import java.util.Optional;

public class RewardEditService {

    private final RewardRepository rewardRepository;
    private final RewardDao rewardDao;

    public RewardEditService(RewardRepository rewardRepository, RewardDao rewardDao) {
        this.rewardRepository = rewardRepository;
        this.rewardDao = rewardDao;
    }

    public void execute(Reward newReward, Long id){

        Reward companyRewardConfiguration = getExistingConfigurationOpt(id);

        rewardRepository.edit(setValuesToEdit(companyRewardConfiguration, newReward));

    }

    private Reward getExistingConfigurationOpt(Long id) {

        Optional<Reward> existingUserOpt = rewardDao.getById(id);

        if (!existingUserOpt.isPresent()){
            throw new RuntimeException("");
        }
        return existingUserOpt.get();
    }

    private Reward setValuesToEdit(Reward lastReward,
                                   Reward newReward){

        return  new Reward(lastReward.getId(),
                newReward.getPointsToRedeem(),
                newReward.getName(),
                true,
                newReward.getDailyPointsLimit(),
                newReward.getWeeklyPointsLimit(),
                newReward.getPointsAccumulatedMessage(),
                newReward.getRedemptionMessage(),
                newReward.getPointsRange(),
                newReward.getExpirationDate(),
                lastReward.getCompany());
    }

}
