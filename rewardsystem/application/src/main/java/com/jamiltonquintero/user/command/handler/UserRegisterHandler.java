package com.jamiltonquintero.user.command.handler;

import com.jamiltonquintero.user.command.UserRegisterCommand;
import com.jamiltonquintero.user.command.factory.UserFactory;
import com.jamiltonquintero.user.service.UserRegisterService;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterHandler {

    private final UserRegisterService userRegisterService;
    private final UserFactory userFactory;

    public UserRegisterHandler(UserRegisterService userRegisterService, UserFactory userFactory) {
        this.userRegisterService = userRegisterService;
        this.userFactory = userFactory;
    }


    public Long execute(UserRegisterCommand userRegisterCommand, Long id){
        return userRegisterService.execute(userFactory.execute(userRegisterCommand), id);
    }

}
