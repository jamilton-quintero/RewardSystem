package com.jamiltonquintero.user.command.factory;

import com.jamiltonquintero.user.command.UserEditCommand;
import com.jamiltonquintero.user.command.UserRegisterCommand;
import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.model.entity.UserToRegister;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

    public UserToRegister execute(UserRegisterCommand companyRegisterCommand){
        return new UserToRegister(
                companyRegisterCommand.getFirstName(),
                companyRegisterCommand.getLastName(),
                companyRegisterCommand.getEmail(),
                companyRegisterCommand.getIdentification());
    }

    public User execute(UserEditCommand userEditCommand){
        return new User(
                userEditCommand.getFirstName(),
                userEditCommand.getLastName(),
                userEditCommand.getEmail(),
                userEditCommand.getIdentification());
    }

}
