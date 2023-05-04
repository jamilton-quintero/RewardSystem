package com.jamiltonquintero.company.adapter.repository;

import com.jamiltonquintero.company.adapter.entity.CompanyEntity;
import com.jamiltonquintero.company.adapter.CompanyJpaRepository;
import com.jamiltonquintero.company.adapter.mapper.CompanyDboMapper;
import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.port.repository.CompanyRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository {

    private final CompanyJpaRepository companyJpaRepository;
    private final CompanyDboMapper companyDboMapper;
    public CompanyRepositoryImpl(CompanyJpaRepository companyJpaRepository, CompanyDboMapper companyDboMapper) {
        this.companyJpaRepository = companyJpaRepository;
        this.companyDboMapper = companyDboMapper;
    }

    @Override
    public Long create(Company company) {
        CompanyEntity companyDbo = companyDboMapper.toDbo(company);
        companyJpaRepository.save(companyDbo);
        return companyDbo.getId();
    }

}
