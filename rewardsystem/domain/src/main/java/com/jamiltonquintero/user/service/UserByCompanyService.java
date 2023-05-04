package com.jamiltonquintero.user.service;

import com.jamiltonquintero.user.UserToUserDto;
import com.jamiltonquintero.user.model.dto.UserDto;
import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.port.dao.UserDao;
import java.util.List;
import java.util.stream.Collectors;

public class UserByCompanyService {

    private final UserDao userDao;

    public UserByCompanyService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<UserDto> execute(Long companyId){

        List<User> users = userDao.getByCompany(companyId);

        if(users.isEmpty()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return users.stream()
                .map(UserToUserDto::execute)
                .collect(Collectors.toList());

    }
}
