package com.jamiltonquintero.company.port.dao;

import com.jamiltonquintero.company.model.Company;

import java.util.Optional;

public interface CompanyDao {

    Optional<Company> getById(Long id);
    Optional<Company> getByEmail(String email);
}
