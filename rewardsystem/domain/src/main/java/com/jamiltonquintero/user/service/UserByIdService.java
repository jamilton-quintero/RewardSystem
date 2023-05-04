package com.jamiltonquintero.user.service;

import com.jamiltonquintero.user.UserToUserDto;
import com.jamiltonquintero.user.model.dto.UserDto;
import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.port.dao.UserDao;

import java.util.Optional;

public class UserByIdService {

    private final UserDao userDao;

    public UserByIdService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDto execute(Long id){

        Optional<User> user = userDao.getById(id);

        if(!user.isPresent()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return UserToUserDto.execute(user.get());

    }
}
