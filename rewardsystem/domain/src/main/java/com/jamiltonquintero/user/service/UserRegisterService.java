package com.jamiltonquintero.user.service;

import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.user.model.entity.UserToRegister;
import com.jamiltonquintero.user.port.repository.UserRepository;

import java.util.Optional;

public class UserRegisterService {

    private final UserRepository userRepository;
    private final CompanyDao companyDao;
    public UserRegisterService(UserRepository userRepository, CompanyDao companyDao) {
        this.userRepository = userRepository;
        this.companyDao = companyDao;
    }

    public Long execute(UserToRegister user, Long companyId){

        Optional<Company> company = companyDao.getById(companyId);

        if (!company.isPresent()){
            throw new RuntimeException("");
        }

        user.getCompanies().add(company.get());

        return userRepository.create(user);

    }
}
