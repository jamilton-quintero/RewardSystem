package com.jamiltonquintero.companyconfiguration.reward.service;

import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardToCreate;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardWithSubRewardToCreate;
import com.jamiltonquintero.companyconfiguration.reward.port.repository.RewardRepository;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.port.dao.SubRewardDao;

import java.util.List;
import java.util.Optional;

public class RewardWithSubRewardRegisterService {

    private static final Integer DEFAULT_VALUE = 0;
    private final RewardRepository rewardRepository;
    private final CompanyDao companyDao;
    private final SubRewardDao subRewardDao;

    public RewardWithSubRewardRegisterService(RewardRepository rewardRepository, CompanyDao companyDao, SubRewardDao subRewardDao) {
        this.rewardRepository = rewardRepository;
        this.companyDao = companyDao;
        this.subRewardDao = subRewardDao;
    }

    public Long execute(RewardWithSubRewardToCreate rewardToCreate, Long companyId, List<Long> subRewardsIds){

        Optional<Company> company = companyDao.getById(companyId);

        if (!company.isPresent()){
            throw new RuntimeException("");
        }

        List<SubReward> subRewards = subRewardDao.getByIds(subRewardsIds);

        if(subRewards.isEmpty() || subRewards.size() != subRewardsIds.size()){
            throw new RuntimeException("");
        }

        rewardToCreate.addCompany(company.get());
        rewardToCreate.addRewards(subRewards);
        rewardToCreate.setPointsToRedeem(DEFAULT_VALUE);

        return rewardRepository.createWithSubRewards(rewardToCreate);

    }
}
