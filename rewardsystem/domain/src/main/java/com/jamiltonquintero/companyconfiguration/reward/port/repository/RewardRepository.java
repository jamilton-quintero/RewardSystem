package com.jamiltonquintero.companyconfiguration.reward.port.repository;


import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardToCreate;

public interface RewardRepository {

    Long create(RewardToCreate configuration);
    void edit(Reward configuration);
    void delete(Long id);
}
