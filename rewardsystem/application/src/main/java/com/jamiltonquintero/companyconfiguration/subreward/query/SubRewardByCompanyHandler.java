package com.jamiltonquintero.companyconfiguration.subreward.query;


import com.jamiltonquintero.companyconfiguration.subreward.model.dto.SubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardByCompanyService;
import org.springframework.stereotype.Component;

@Component
public class SubRewardByCompanyHandler {

    private final SubRewardByCompanyService subRewardByCompanyService;

    public SubRewardByCompanyHandler(SubRewardByCompanyService subRewardByCompanyService) {
        this.subRewardByCompanyService = subRewardByCompanyService;
    }

    public SubRewardDto execute(Long companyId){
        return subRewardByCompanyService
                .execute(companyId);
    }

}
