package com.jamiltonquintero.companyconfiguration.reward.query;

import com.jamiltonquintero.companyconfiguration.reward.model.dto.RewardDto;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardAllByCompanyService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RewardAllByCompanyHandler {

    private final RewardAllByCompanyService rewardAllByCompanyService;

    public RewardAllByCompanyHandler(RewardAllByCompanyService rewardAllByCompanyService) {
        this.rewardAllByCompanyService = rewardAllByCompanyService;
    }

    public List<RewardDto> execute(Long companyId){
        return rewardAllByCompanyService
                .execute(companyId);
    }

}
