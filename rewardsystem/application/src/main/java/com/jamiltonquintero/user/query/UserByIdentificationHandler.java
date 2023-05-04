package com.jamiltonquintero.user.query;

import com.jamiltonquintero.user.model.dto.UserDto;
import com.jamiltonquintero.user.service.UserByIdentificationService;
import org.springframework.stereotype.Component;

@Component
public class UserByIdentificationHandler {

    private final UserByIdentificationService userByIdentificationService;

    public UserByIdentificationHandler(UserByIdentificationService userByIdentificationService) {
        this.userByIdentificationService = userByIdentificationService;
    }

    public UserDto execute(String identification){
        return userByIdentificationService
                .execute(identification);
    }

}
