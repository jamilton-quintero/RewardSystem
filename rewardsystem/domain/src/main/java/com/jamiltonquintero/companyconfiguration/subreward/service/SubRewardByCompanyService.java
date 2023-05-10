package com.jamiltonquintero.companyconfiguration.subreward.service;

import com.jamiltonquintero.companyconfiguration.subreward.SubRewardToSubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.model.dto.SubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.port.dao.SubRewardDao;

import java.util.Optional;

public class SubRewardByCompanyService {

    private final SubRewardDao subRewardDao;

    public SubRewardByCompanyService(SubRewardDao subRewardDao) {
        this.subRewardDao = subRewardDao;
    }

    public SubRewardDto execute(Long companyId){

        Optional<SubReward> subReward = subRewardDao.getByCompany(companyId);

        if(!subReward.isPresent()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return SubRewardToSubRewardDto.execute(subReward.get());

    }
}
