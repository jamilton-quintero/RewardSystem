package com.jamiltonquintero.companyconfiguration.subreward.port.dao;

import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;

import java.util.List;
import java.util.Optional;

public interface SubRewardDao {

    Optional<SubReward> getById(Long id);
    Optional<SubReward> getByCompany(Long companyId);
    List<SubReward> getAllByCompany(Long companyId);
}
