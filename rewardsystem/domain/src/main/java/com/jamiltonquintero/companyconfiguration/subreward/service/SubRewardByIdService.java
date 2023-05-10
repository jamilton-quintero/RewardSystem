package com.jamiltonquintero.companyconfiguration.subreward.service;

import com.jamiltonquintero.companyconfiguration.subreward.SubRewardToSubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.model.dto.SubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.port.dao.SubRewardDao;

import java.util.Optional;

public class SubRewardByIdService {

    private final SubRewardDao subRewardDao;

    public SubRewardByIdService(SubRewardDao subRewardDao) {
        this.subRewardDao = subRewardDao;
    }

    public SubRewardDto execute(Long id){

        Optional<SubReward> companyConfiguration = subRewardDao.getById(id);

        if(!companyConfiguration.isPresent()){
            throw new RuntimeException("agregar excepcion personal");
        }
        return SubRewardToSubRewardDto.execute(companyConfiguration.get());
    }
}
