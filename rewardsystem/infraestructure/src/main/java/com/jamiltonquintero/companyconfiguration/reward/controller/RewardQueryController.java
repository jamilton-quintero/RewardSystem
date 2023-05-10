package com.jamiltonquintero.companyconfiguration.reward.controller;

import com.jamiltonquintero.companyconfiguration.reward.model.dto.RewardDto;
import com.jamiltonquintero.companyconfiguration.reward.query.RewardAllByCompanyHandler;
import com.jamiltonquintero.companyconfiguration.reward.query.RewardByCompanyHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rewards")
public class RewardQueryController {

    private final RewardByCompanyHandler rewardByCompanyHandler;
    private final RewardAllByCompanyHandler rewardAllByCompanyHandler;

    public RewardQueryController(RewardByCompanyHandler rewardByCompanyHandler,
                                 RewardAllByCompanyHandler rewardAllByCompanyHandler) {
        this.rewardByCompanyHandler = rewardByCompanyHandler;
        this.rewardAllByCompanyHandler = rewardAllByCompanyHandler;
    }

    @GetMapping("/{id}")
    public RewardDto getById(@PathVariable long id){
        return rewardByCompanyHandler.execute(id);
    }

    @GetMapping("/companies/{companyId}")
    public List<RewardDto> getAllByCompany(@PathVariable long companyId){
        return rewardAllByCompanyHandler.execute(companyId);
    }

}
