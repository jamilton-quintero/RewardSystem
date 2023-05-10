package com.jamiltonquintero.company.adapter.dao;

import com.jamiltonquintero.company.adapter.CompanyJpaRepository;
import com.jamiltonquintero.company.adapter.mapper.CompanyDboMapper;
import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.port.dao.CompanyDao;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyDaoImpl implements CompanyDao {

    private final CompanyJpaRepository companyJpaRepository;
    private final CompanyDboMapper companyDboMapper;

    public CompanyDaoImpl(CompanyJpaRepository companyJpaRepository, CompanyDboMapper companyDboMapper) {
        this.companyJpaRepository = companyJpaRepository;
        this.companyDboMapper = companyDboMapper;
    }

    @Override
    public Optional<Company> getById(Long id) {
        return companyJpaRepository.findById(id)
                .map(companyDboMapper::toDomain);
    }

    @Override
    public Optional<Company> getByEmail(String email) {
        return companyJpaRepository.findByEmail(email)
                .map(companyDboMapper::toDomain);
    }
}
