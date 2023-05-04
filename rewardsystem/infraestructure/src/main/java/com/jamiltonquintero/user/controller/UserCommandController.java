package com.jamiltonquintero.user.controller;

import com.jamiltonquintero.user.command.UserRegisterCommand;
import com.jamiltonquintero.user.command.handler.UserRegisterHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserCommandController {

    private final UserRegisterHandler userRegisterHandler;

    public UserCommandController(UserRegisterHandler userRegisterHandler) {
        this.userRegisterHandler = userRegisterHandler;
    }

    @PostMapping("/companies/{companyId}")
    public Long userRegisterAndAddToCompany(@RequestBody UserRegisterCommand userRegisterCommand,
                                @PathVariable Long companyId){
        return userRegisterHandler.execute(userRegisterCommand, companyId);
    }

}
