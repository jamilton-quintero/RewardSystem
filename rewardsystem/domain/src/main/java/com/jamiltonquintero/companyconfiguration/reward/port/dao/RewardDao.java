package com.jamiltonquintero.companyconfiguration.reward.port.dao;

import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;

import java.util.List;
import java.util.Optional;

public interface RewardDao {

    Optional<Reward> getById(Long id);
    Optional<Reward> getByCompany(Long companyId);
    List<Reward> getAllByCompany(Long companyId);
    List<Reward> getByIds(List<Long> rewardsIds);
}
