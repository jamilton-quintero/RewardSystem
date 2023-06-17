package com.jamiltonquintero.companyconfiguration.subreward.adapter;

import com.jamiltonquintero.companyconfiguration.subreward.adapter.entity.SubRewardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubRewardJpaRepository extends JpaRepository<SubRewardEntity, Long> {

    //Optional<SubRewardEntity> findByCompanyId(Long companyId);
    List<SubRewardEntity> findAllByCompanyId(Long companyId);
    List<SubRewardEntity> findAllByIdIn(List<Long> ids);
    List<SubRewardEntity> findAllByCompanyIdAndRewardsId(Long companyId, Long rewardId);

}
