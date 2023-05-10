package com.jamiltonquintero.companyconfiguration.subreward.service;

import com.jamiltonquintero.companyconfiguration.subreward.SubRewardToSubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.model.dto.SubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.port.dao.SubRewardDao;

import java.util.List;
import java.util.stream.Collectors;

public class SubRewardAllByCompanyService {

    private final SubRewardDao subRewardDao;

    public SubRewardAllByCompanyService(SubRewardDao subRewardDao) {
        this.subRewardDao = subRewardDao;
    }

    public List<SubRewardDto> execute(Long companyId){

        List<SubReward> subRewards = subRewardDao.getAllByCompany(companyId);

        if(subRewards.isEmpty()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return subRewards
                .stream()
                .map(SubRewardToSubRewardDto::execute)
                .collect(Collectors.toList());

    }
}
