package com.jamiltonquintero.companyconfiguration.adapter;

import com.jamiltonquintero.companyconfiguration.adapter.entity.CompanyConfigurationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompanyConfigurationJpaRepository extends JpaRepository<CompanyConfigurationEntity, Long> {

    Optional<CompanyConfigurationEntity> findByCompanyId(Long companyId);
    List<CompanyConfigurationEntity> findAllByCompanyId(Long companyId);

}
