package com.jamiltonquintero.user.controller;

import com.jamiltonquintero.user.model.dto.UserDto;
import com.jamiltonquintero.user.model.dto.UserSummaryDto;
import com.jamiltonquintero.user.query.UserSummaryAllByCompanyHandler;
import com.jamiltonquintero.user.query.UserByIdHandler;
import com.jamiltonquintero.user.query.UserByIdentificationHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserQueryController {

    private final UserByIdHandler userByIdHandler;
    private final UserByIdentificationHandler userByIdentificationHandler;
    private final UserSummaryAllByCompanyHandler userSummaryAllByCompanyHandler;
    public UserQueryController(UserByIdHandler userByIdHandler, UserByIdentificationHandler userByIdentificationHandler, UserSummaryAllByCompanyHandler userSummaryAllByCompanyHandler) {
        this.userByIdHandler = userByIdHandler;
        this.userByIdentificationHandler = userByIdentificationHandler;
        this.userSummaryAllByCompanyHandler = userSummaryAllByCompanyHandler;
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable long id){
        return userByIdHandler.execute(id);
    }

    @GetMapping(params = "identification")
    public UserDto getUserByIdentification(@RequestParam String identification){
        return userByIdentificationHandler.execute(identification);
    }

    @GetMapping("/companies/{companyId}")
    public List<UserSummaryDto> getUsersByCompany(@PathVariable Long companyId) {
        return userSummaryAllByCompanyHandler.execute(companyId);
    }

}
