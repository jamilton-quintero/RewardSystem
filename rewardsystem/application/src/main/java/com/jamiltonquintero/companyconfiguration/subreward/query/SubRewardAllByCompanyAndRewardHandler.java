package com.jamiltonquintero.companyconfiguration.subreward.query;

import com.jamiltonquintero.companyconfiguration.subreward.model.dto.SubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardAllByCompanyAndRewardService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SubRewardAllByCompanyAndRewardHandler {

    private final SubRewardAllByCompanyAndRewardService subRewardAllByCompanyAndRewardService;

    public SubRewardAllByCompanyAndRewardHandler(SubRewardAllByCompanyAndRewardService subRewardAllByCompanyAndRewardService) {
        this.subRewardAllByCompanyAndRewardService = subRewardAllByCompanyAndRewardService;
    }

    public List<SubRewardDto> execute(long companyId, long rewardId){
        return subRewardAllByCompanyAndRewardService
                .execute(companyId, rewardId);
    }

}
