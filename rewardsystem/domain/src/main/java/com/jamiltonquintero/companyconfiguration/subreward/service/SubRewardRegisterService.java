package com.jamiltonquintero.companyconfiguration.subreward.service;

import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubRewardToCreate;
import com.jamiltonquintero.companyconfiguration.subreward.port.repository.SubRewardRepository;

public class SubRewardRegisterService {

    private final SubRewardRepository subRewardRepository;

    public SubRewardRegisterService(SubRewardRepository subRewardRepository) {
        this.subRewardRepository = subRewardRepository;
    }

    public Long execute(SubRewardToCreate subRewardToCreate, Long companyId){
        return subRewardRepository.create(subRewardToCreate);
    }
}
