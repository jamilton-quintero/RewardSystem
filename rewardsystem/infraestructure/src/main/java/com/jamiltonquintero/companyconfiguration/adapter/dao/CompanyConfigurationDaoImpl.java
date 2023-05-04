package com.jamiltonquintero.companyconfiguration.adapter.dao;

import com.jamiltonquintero.companyconfiguration.adapter.CompanyConfigurationJpaRepository;
import com.jamiltonquintero.companyconfiguration.adapter.mapper.CompanyConfigurationDboMapper;
import com.jamiltonquintero.companyconfiguration.model.entity.CompanyConfiguration;
import com.jamiltonquintero.companyconfiguration.port.dao.CompanyConfigurationDao;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CompanyConfigurationDaoImpl implements CompanyConfigurationDao {


    private final CompanyConfigurationJpaRepository companyConfigurationJpaRepository;
    private final CompanyConfigurationDboMapper companyConfigurationDboMapper;

    public CompanyConfigurationDaoImpl(CompanyConfigurationJpaRepository companyConfigurationJpaRepository, CompanyConfigurationDboMapper companyConfigurationDboMapper) {
        this.companyConfigurationJpaRepository = companyConfigurationJpaRepository;
        this.companyConfigurationDboMapper = companyConfigurationDboMapper;
    }

    @Override

    public Optional<CompanyConfiguration> getById(Long id) {
        return companyConfigurationJpaRepository.findById(id)
                .map(companyConfigurationDboMapper::toDomain);
    }

    @Override
    public Optional<CompanyConfiguration> getByCompany(Long companyId) {
        return companyConfigurationJpaRepository.findByCompanyId(companyId)
                .map(companyConfigurationDboMapper::toDomain);
    }

    @Override
    public List<CompanyConfiguration> getAllByCompany(Long companyId) {
        return companyConfigurationJpaRepository.findAllByCompanyId(companyId)
                .stream()
                .map(companyConfigurationDboMapper::toDomain)
                .collect(Collectors.toList());
    }

}
