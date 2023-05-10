package com.jamiltonquintero.companyconfiguration.subreward.query;

import com.jamiltonquintero.companyconfiguration.subreward.model.dto.SubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardAllByCompanyService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SubRewardAllByCompanyHandler {

    private final SubRewardAllByCompanyService companyConfigurationAllByCompanyService;

    public SubRewardAllByCompanyHandler(SubRewardAllByCompanyService companyConfigurationAllByCompanyService) {
        this.companyConfigurationAllByCompanyService = companyConfigurationAllByCompanyService;
    }

    public List<SubRewardDto> execute(Long companyId){
        return companyConfigurationAllByCompanyService
                .execute(companyId);
    }

}
