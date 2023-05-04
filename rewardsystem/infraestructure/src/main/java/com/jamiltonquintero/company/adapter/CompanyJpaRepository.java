package com.jamiltonquintero.company.adapter;

import com.jamiltonquintero.company.adapter.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CompanyJpaRepository extends JpaRepository<CompanyEntity, Long> {
    Optional<CompanyEntity> findByEmail(String email);
}
