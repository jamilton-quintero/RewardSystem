package com.jamiltonquintero.user.controller;

import com.jamiltonquintero.user.command.UserEditCommand;
import com.jamiltonquintero.user.command.UserRegisterCommand;
import com.jamiltonquintero.user.command.handler.UserDeleteHandler;
import com.jamiltonquintero.user.command.handler.UserEditHandler;
import com.jamiltonquintero.user.command.handler.UserRegisterHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserCommandController {

    private final UserRegisterHandler userRegisterHandler;
    private final UserEditHandler userEditHandler;
    private final UserDeleteHandler userDeleteHandler;
    public UserCommandController(UserRegisterHandler userRegisterHandler, UserEditHandler userEditHandler, UserDeleteHandler userDeleteHandler) {
        this.userRegisterHandler = userRegisterHandler;
        this.userEditHandler = userEditHandler;
        this.userDeleteHandler = userDeleteHandler;
    }

    @PutMapping("/{id}")
    public void userEdit(@RequestBody UserEditCommand userEditCommand,
                         @PathVariable Long id){
         userEditHandler.execute(userEditCommand, id);
    }

    @DeleteMapping("/{id}")
    public void userDelete(@PathVariable Long id){
        userDeleteHandler.execute(id);
    }

    @PostMapping("/companies/{companyId}")
    public Long userRegisterAndAddToCompany(@RequestBody UserRegisterCommand userRegisterCommand,
                                @PathVariable Long companyId){
        return userRegisterHandler.execute(userRegisterCommand, companyId);
    }


}
