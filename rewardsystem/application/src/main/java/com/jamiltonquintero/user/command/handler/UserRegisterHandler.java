package com.jamiltonquintero.user.command.handler;

import com.jamiltonquintero.user.command.UserRegisterCommand;
import com.jamiltonquintero.user.command.factory.UserRegisterFactory;
import com.jamiltonquintero.user.service.UserRegisterService;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterHandler {

    private final UserRegisterService userRegisterService;
    private final UserRegisterFactory userRegisterFactory;

    public UserRegisterHandler(UserRegisterService userRegisterService, UserRegisterFactory userRegisterFactory) {
        this.userRegisterService = userRegisterService;
        this.userRegisterFactory = userRegisterFactory;
    }


    public Long execute(UserRegisterCommand userRegisterCommand, Long id){
        return userRegisterService.execute(userRegisterFactory.execute(userRegisterCommand), id);
    }

}
