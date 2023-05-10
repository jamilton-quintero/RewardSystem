package com.jamiltonquintero.user.query;

import com.jamiltonquintero.user.model.dto.UserSummaryDto;
import com.jamiltonquintero.user.service.UserSummaryAllByCompanyService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserSummaryAllByCompanyHandler {

    private final UserSummaryAllByCompanyService userSummaryAllByCompanyService;

    public UserSummaryAllByCompanyHandler(UserSummaryAllByCompanyService userSummaryAllByCompanyService) {
        this.userSummaryAllByCompanyService = userSummaryAllByCompanyService;
    }

    public List<UserSummaryDto> execute(Long companyId){
        return userSummaryAllByCompanyService
                .execute(companyId);
    }

}
