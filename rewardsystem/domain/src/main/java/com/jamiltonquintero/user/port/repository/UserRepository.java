package com.jamiltonquintero.user.port.repository;


import com.jamiltonquintero.user.model.entity.UserToRegister;

public interface UserRepository {

    Long create(UserToRegister user);

}
