package com.jamiltonquintero.user.adapter.mapper;

import com.jamiltonquintero.company.adapter.entity.CompanyEntity;
import com.jamiltonquintero.company.adapter.mapper.CompanyDboMapper;
import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.user.adapter.entity.UserEntity;
import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.model.entity.UserToRegister;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserDboMapper {

    private final CompanyDboMapper companyDboMapper;

    public UserDboMapper(CompanyDboMapper companyDboMapper) {
        this.companyDboMapper = companyDboMapper;
    }

    public UserEntity toDboRegister(UserToRegister domain) {
        if (domain == null) {
            return null;
        }

        Set<CompanyEntity> companies = domain.getCompanies().stream().map(companyDboMapper::toDbo)
                .collect(Collectors.toSet());

        UserEntity userEntity = new UserEntity(domain.getFirstName(), domain.getLastName(), domain.getEmail(),
                domain.getIdentification(), domain.getTotalPoints(), companies);

        companies.forEach(company -> {
            if (company.getUsers() == null) {
                company.setUsers(new HashSet<>());
            }
            company.getUsers().add(userEntity);
        });

        return userEntity;
    }

    public UserEntity toDbo(User domain) {

        Set<CompanyEntity> companies = domain.getCompanies().stream().map(companyDboMapper::toDbo)
                .collect(Collectors.toSet());

        return new UserEntity(domain.getId(),domain.getFirstName(), domain.getLastName(), domain.getEmail(),
                domain.getIdentification(),domain.getTotalPoints(), companies);
    }

    public User toDomain(UserEntity entity) {

        if (entity == null) {
            return null;
        }

        return new User(entity.getId(), entity.getFirstName(), entity.getLastName(), entity.getEmail(), entity.getIdentification(),
                entity.getTotalPoints());
    }

    public User toDomainWhitCompanies(UserEntity entity) {

        if (entity == null) {
            return null;
        }

        List<Company> companies = entity.getCompanies().stream().map(companyDboMapper::toDomain)
                .collect(Collectors.toList());

        return new User(entity.getId(), entity.getFirstName(), entity.getLastName(), entity.getEmail(), entity.getIdentification(),
                entity.getTotalPoints(), companies);
    }

}