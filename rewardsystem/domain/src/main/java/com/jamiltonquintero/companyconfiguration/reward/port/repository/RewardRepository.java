package com.jamiltonquintero.companyconfiguration.reward.port.repository;


import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardToCreate;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardWithSubRewardToCreate;

public interface RewardRepository {

    Long create(RewardToCreate rewardToCreate);
    Long createWithSubRewards(RewardWithSubRewardToCreate rewardToCreate);
    void edit(Reward configuration);
    void delete(Long id);
}
