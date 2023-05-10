package com.jamiltonquintero.companyconfiguration.subreward.service;

import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.port.dao.SubRewardDao;
import com.jamiltonquintero.companyconfiguration.subreward.port.repository.SubRewardRepository;

import java.util.Optional;

public class SubRewardEditService {

    private final SubRewardRepository subRewardRepository;
    private final SubRewardDao subRewardDao;

    public SubRewardEditService(SubRewardRepository subRewardRepository, SubRewardDao subRewardDao) {
        this.subRewardRepository = subRewardRepository;
        this.subRewardDao = subRewardDao;
    }

    public void execute(SubReward newSubReward, Long id){

        SubReward subRewardConfiguration = getExistingSubRewardOpt(id);

        SubReward subRewardToEdit = setValuesToEdit(subRewardConfiguration, newSubReward);

        subRewardRepository.edit(subRewardToEdit);

    }

    private SubReward getExistingSubRewardOpt(Long id) {

        Optional<SubReward> existingSubRewardOpt = subRewardDao.getById(id);

        if (!existingSubRewardOpt.isPresent()){
            throw new RuntimeException("");
        }
        return existingSubRewardOpt.get();
    }

    private SubReward setValuesToEdit(SubReward lastSubReward,
                                      SubReward newSubReward){

        return  new SubReward(
                lastSubReward.getId(),
                newSubReward.getPointsToRedeem(),
                newSubReward.getName());
    }

}
