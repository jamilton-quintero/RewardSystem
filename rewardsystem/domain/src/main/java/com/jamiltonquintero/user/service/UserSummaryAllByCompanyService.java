package com.jamiltonquintero.user.service;

import com.jamiltonquintero.user.model.dto.UserSummaryDto;
import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.port.dao.UserDao;
import java.util.List;
import java.util.stream.Collectors;

public class UserSummaryAllByCompanyService {

    private final UserDao userDao;

    public UserSummaryAllByCompanyService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<UserSummaryDto> execute(Long companyId){

        List<User> users = userDao.getByCompany(companyId);

        if(users.isEmpty()){
            throw new RuntimeException("agregar excepcion personal");
        }

        return users.stream()
                .map(this::buildUserSummaryDto)
                .collect(Collectors.toList());

    }

    private UserSummaryDto buildUserSummaryDto(User user){

        String fullName = buildFullName(user.getFirstName(), user.getLastName());

        return new UserSummaryDto(user.getId(), fullName, user.getEmail(), user.getIdentification());
    }

    private String buildFullName(String firsName, String lastName){
        return String.format(firsName, " " ,lastName);
    }

}
