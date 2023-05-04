package com.jamiltonquintero.company.adapter.mapper;

import com.jamiltonquintero.company.adapter.entity.CompanyEntity;
import com.jamiltonquintero.company.model.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyDboMapper {

    public CompanyEntity toDbo(Company domain) {
        if (domain == null) {
            return null;
        }

        if (domain.getId() == null){
            return new CompanyEntity(domain.getName(), domain.getEmail(), domain.getPassword(), domain.getCreationDate());
        }

        return new CompanyEntity(domain.getId(), domain.getName(), domain.getEmail(), domain.getPassword(), domain.getCreationDate());
    }

    public Company toDomain(CompanyEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Company(entity.getId(), entity.getName(), entity.getEmail(), entity.getPassword(), entity.getCreationDate());
    }

}