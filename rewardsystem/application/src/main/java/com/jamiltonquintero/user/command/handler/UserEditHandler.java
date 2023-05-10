package com.jamiltonquintero.user.command.handler;

import com.jamiltonquintero.user.command.UserEditCommand;
import com.jamiltonquintero.user.command.factory.UserFactory;
import com.jamiltonquintero.user.service.UserEditService;
import org.springframework.stereotype.Component;

@Component
public class UserEditHandler {

    private final UserEditService userEditService;
    private final UserFactory userFactory;

    public UserEditHandler(UserEditService userEditService, UserFactory userFactory) {
        this.userEditService = userEditService;
        this.userFactory = userFactory;
    }

    public void execute(UserEditCommand userEditCommand, Long id){
        userEditService.execute(userFactory.execute(userEditCommand), id);
    }

}
