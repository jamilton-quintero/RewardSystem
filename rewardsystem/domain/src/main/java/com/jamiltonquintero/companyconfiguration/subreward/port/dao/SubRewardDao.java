package com.jamiltonquintero.companyconfiguration.subreward.port.dao;

import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;

import java.util.List;
import java.util.Optional;

public interface SubRewardDao {

    Optional<SubReward> getById(long id);
    Optional<SubReward> getByCompany(long companyId);
    List<SubReward> getAllByCompany(long companyId);
    List<SubReward> getByIds(List<Long> ids);
    List<SubReward> getAllByCompanyAndReward(long companyId, long rewardId);
}
