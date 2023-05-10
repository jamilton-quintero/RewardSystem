package com.jamiltonquintero.companyconfiguration.reward.service;

import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.RewardToCreate;
import com.jamiltonquintero.companyconfiguration.reward.port.repository.RewardRepository;

import java.util.Optional;

public class RewardRegisterService {

    private final RewardRepository rewardRepository;
    private final CompanyDao companyDao;

    public RewardRegisterService(RewardRepository rewardRepository, CompanyDao companyDao) {
        this.rewardRepository = rewardRepository;
        this.companyDao = companyDao;
    }

    public Long execute(RewardToCreate companyConfiguration, Long companyId){

        Optional<Company> company = companyDao.getById(companyId);

        if (!company.isPresent()){
            throw new RuntimeException("");
        }

        companyConfiguration.addCompany(company.get());

        return rewardRepository.create(companyConfiguration);
    }
}
