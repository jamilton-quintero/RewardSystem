package com.jamiltonquintero.user.service;

import com.jamiltonquintero.user.UserToUserDto;
import com.jamiltonquintero.user.model.dto.UserDto;
import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.port.dao.UserDao;

import java.util.Optional;

public class UserByIdentificationService {

    private final UserDao userDao;

    public UserByIdentificationService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDto execute(String identification){

        Optional<User> user = userDao.getByIdentification(identification);

        if(!user.isPresent()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return UserToUserDto.execute(user.get());

    }
}
