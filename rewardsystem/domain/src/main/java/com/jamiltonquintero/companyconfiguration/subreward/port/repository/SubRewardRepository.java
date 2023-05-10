package com.jamiltonquintero.companyconfiguration.subreward.port.repository;


import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubRewardToCreate;

public interface SubRewardRepository {

    Long create(SubRewardToCreate configuration);
    void edit(SubReward configuration);
    void delete(Long id);
}
