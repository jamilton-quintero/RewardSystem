package com.jamiltonquintero.user.adapter;

import com.jamiltonquintero.user.adapter.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByIdentification(String identification);
    List<UserEntity> findAllByCompaniesId(Long companyId);
    Optional<UserEntity> findByEmail(String email);
}
