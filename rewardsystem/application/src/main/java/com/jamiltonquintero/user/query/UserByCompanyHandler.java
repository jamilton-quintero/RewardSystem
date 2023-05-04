package com.jamiltonquintero.user.query;

import com.jamiltonquintero.user.model.dto.UserDto;
import com.jamiltonquintero.user.service.UserByCompanyService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserByCompanyHandler {

    private final UserByCompanyService userByCompanyService;

    public UserByCompanyHandler(UserByCompanyService userByCompanyService) {
        this.userByCompanyService = userByCompanyService;
    }

    public List<UserDto> execute(Long companyId){
        return userByCompanyService
                .execute(companyId);
    }

}
