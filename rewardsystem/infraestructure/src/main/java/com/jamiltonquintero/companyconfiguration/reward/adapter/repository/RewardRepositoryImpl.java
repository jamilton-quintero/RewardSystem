package com.jamiltonquintero.companyconfiguration.reward.adapter.repository;

import com.jamiltonquintero.companyconfiguration.reward.adapter.RewardJpaRepository;
import com.jamiltonquintero.companyconfiguration.reward.adapter.entity.RewardEntity;
import com.jamiltonquintero.companyconfiguration.reward.adapter.mapper.RewardDboMapper;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardToCreate;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardWithSubRewardToCreate;
import com.jamiltonquintero.companyconfiguration.reward.port.repository.RewardRepository;
import org.springframework.stereotype.Service;

@Service
public class RewardRepositoryImpl implements RewardRepository {

    private final RewardJpaRepository rewardJpaRepository;
    private final RewardDboMapper rewardDboMapper;
    public RewardRepositoryImpl(RewardJpaRepository rewardJpaRepository, RewardDboMapper rewardDboMapper) {
        this.rewardJpaRepository = rewardJpaRepository;
        this.rewardDboMapper = rewardDboMapper;
    }


    @Override
    public Long create(RewardToCreate configuration) {
        RewardEntity companyConfigurationDbo = rewardDboMapper.toDboCreate(configuration);
        RewardEntity createdConfiguration = rewardJpaRepository.save(companyConfigurationDbo);
        return createdConfiguration.getId();
    }

    @Override
    public Long createWithSubRewards(RewardWithSubRewardToCreate rewardToCreate) {
        RewardEntity companyConfigurationDbo = rewardDboMapper.toDboCreateWithSubRewards(rewardToCreate);
        RewardEntity createdConfiguration = rewardJpaRepository.save(companyConfigurationDbo);
        return createdConfiguration.getId();
    }

    @Override
    public void edit(Reward configuration) {
        RewardEntity companyConfigurationDbo = rewardDboMapper.toDbo(configuration);
        rewardJpaRepository.save(companyConfigurationDbo);
    }

    @Override
    public void delete(Long id) {
        rewardJpaRepository.deleteById(id);
    }
}
