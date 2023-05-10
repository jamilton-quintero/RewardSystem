package com.jamiltonquintero.companyconfiguration.reward.adapter;

import com.jamiltonquintero.companyconfiguration.reward.adapter.entity.RewardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RewardJpaRepository extends JpaRepository<RewardEntity, Long> {

    Optional<RewardEntity> findByCompanyId(Long companyId);
    List<RewardEntity> findAllByCompanyId(Long companyId);

}
