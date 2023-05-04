package com.jamiltonquintero.user.port.dao;

import com.jamiltonquintero.user.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    Optional<User> getById(Long id);
    Optional<User> getByIdentification(String identification);
    List<User> getByCompany(Long companyId);
}
