package com.jamiltonquintero.companyconfiguration.reward.query;

import com.jamiltonquintero.companyconfiguration.reward.model.dto.RewardDto;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardByCompanyService;
import org.springframework.stereotype.Component;

@Component
public class RewardByCompanyHandler {

    private final RewardByCompanyService rewardByCompanyService;

    public RewardByCompanyHandler(RewardByCompanyService rewardByCompanyService) {
        this.rewardByCompanyService = rewardByCompanyService;
    }

    public RewardDto execute(Long companyId){
        return rewardByCompanyService
                .execute(companyId);
    }

}
