package com.jamiltonquintero.user.command.factory;

import com.jamiltonquintero.user.command.UserRegisterCommand;
import com.jamiltonquintero.user.model.entity.UserToRegister;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterFactory {

    public UserToRegister execute(UserRegisterCommand companyRegisterCommand){
        return new UserToRegister(
                companyRegisterCommand.getFirstName(),
                companyRegisterCommand.getLastName(),
                companyRegisterCommand.getEmail(),
                companyRegisterCommand.getIdentification());
    }

}
