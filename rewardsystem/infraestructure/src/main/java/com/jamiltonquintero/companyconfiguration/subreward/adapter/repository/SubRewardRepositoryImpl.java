package com.jamiltonquintero.companyconfiguration.subreward.adapter.repository;

import com.jamiltonquintero.companyconfiguration.subreward.adapter.entity.SubRewardEntity;
import com.jamiltonquintero.companyconfiguration.subreward.adapter.mapper.SubRewardDboMapper;
import com.jamiltonquintero.companyconfiguration.subreward.adapter.SubRewardJpaRepository;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubRewardToCreate;
import com.jamiltonquintero.companyconfiguration.subreward.port.repository.SubRewardRepository;
import org.springframework.stereotype.Service;

@Service
public class SubRewardRepositoryImpl implements SubRewardRepository {

    private final SubRewardJpaRepository subRewardJpaRepository;
    private final SubRewardDboMapper subRewardDboMapper;
    public SubRewardRepositoryImpl(SubRewardJpaRepository subRewardJpaRepository, SubRewardDboMapper subRewardDboMapper) {
        this.subRewardJpaRepository = subRewardJpaRepository;
        this.subRewardDboMapper = subRewardDboMapper;
    }


    @Override
    public Long create(SubRewardToCreate subReward) {
        SubRewardEntity subRewardDbo = subRewardDboMapper.toDboCreate(subReward);
        SubRewardEntity createdSubReward = subRewardJpaRepository.save(subRewardDbo);
        return createdSubReward.getId();
    }

    @Override
    public void edit(SubReward configuration) {
        SubRewardEntity companyConfigurationDbo = subRewardDboMapper.toDbo(configuration);
        subRewardJpaRepository.save(companyConfigurationDbo);
    }

    @Override
    public void delete(Long id) {
        subRewardJpaRepository.deleteById(id);
    }
}
