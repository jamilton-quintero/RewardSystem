package com.jamiltonquintero.companyconfiguration.reward.adapter.dao;

import com.jamiltonquintero.companyconfiguration.reward.adapter.RewardJpaRepository;
import com.jamiltonquintero.companyconfiguration.reward.adapter.mapper.RewardDboMapper;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.port.dao.RewardDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RewardDaoImpl implements RewardDao {


    private final RewardJpaRepository rewardJpaRepository;
    private final RewardDboMapper rewardDboMapper;

    public RewardDaoImpl(RewardJpaRepository rewardJpaRepository, RewardDboMapper rewardDboMapper) {
        this.rewardJpaRepository = rewardJpaRepository;
        this.rewardDboMapper = rewardDboMapper;
    }

    @Override

    public Optional<Reward> getById(Long id) {
        return rewardJpaRepository.findById(id)
                .map(rewardDboMapper::toDomain);
    }

    @Override
    public Optional<Reward> getByCompany(Long companyId) {
        return rewardJpaRepository.findByCompanyId(companyId)
                .map(rewardDboMapper::toDomain);
    }

    @Override
    public List<Reward> getAllByCompany(Long companyId) {
        return rewardJpaRepository.findAllByCompanyId(companyId)
                .stream()
                .map(rewardDboMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public List<Reward> getByIds(List<Long> rewardsIds) {
        return rewardJpaRepository.findAllById(rewardsIds)
                .stream()
                .map(rewardDboMapper::toDomain)
                .collect(Collectors.toList());
    }

}
