package com.jamiltonquintero.companyconfiguration.port.dao;

import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfiguration;
import com.jamiltonquintero.user.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface CompanyConfigurationDao {

    Optional<CompanyConfiguration> getById(Long id);
    Optional<CompanyConfiguration> getByCompany(Long companyId);
    List<CompanyConfiguration> getAllByCompany(Long companyId);
}
