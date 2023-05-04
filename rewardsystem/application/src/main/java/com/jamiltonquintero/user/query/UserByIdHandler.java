package com.jamiltonquintero.user.query;

import com.jamiltonquintero.user.model.dto.UserDto;
import com.jamiltonquintero.user.service.UserByIdService;
import org.springframework.stereotype.Component;

@Component
public class UserByIdHandler {

    private final UserByIdService userByIdService;

    public UserByIdHandler(UserByIdService userByIdService) {
        this.userByIdService = userByIdService;
    }

    public UserDto execute(Long id){
        return userByIdService
                .execute(id);
    }

}
