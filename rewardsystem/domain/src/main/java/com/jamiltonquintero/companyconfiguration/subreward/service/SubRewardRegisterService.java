package com.jamiltonquintero.companyconfiguration.subreward.service;

import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubRewardToCreate;
import com.jamiltonquintero.companyconfiguration.subreward.port.repository.SubRewardRepository;

import java.util.Optional;

public class SubRewardRegisterService {

    private final SubRewardRepository subRewardRepository;
    private final CompanyDao companyDao;

    public SubRewardRegisterService(SubRewardRepository subRewardRepository, CompanyDao companyDao) {
        this.subRewardRepository = subRewardRepository;
        this.companyDao = companyDao;
    }

    public Long execute(SubRewardToCreate subRewardToCreate, Long companyId){

        Optional<Company> company = companyDao.getById(companyId);

        if (!company.isPresent()){
            throw new RuntimeException("");
        }

        subRewardToCreate.addCompany(company.get());

        return subRewardRepository.create(subRewardToCreate);
    }
}
