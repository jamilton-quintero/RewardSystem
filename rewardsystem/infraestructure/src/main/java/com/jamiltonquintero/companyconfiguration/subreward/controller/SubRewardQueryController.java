package com.jamiltonquintero.companyconfiguration.subreward.controller;

import com.jamiltonquintero.companyconfiguration.subreward.model.dto.SubRewardDto;
import com.jamiltonquintero.companyconfiguration.subreward.query.SubRewardAllByCompanyHandler;
import com.jamiltonquintero.companyconfiguration.subreward.query.SubRewardByCompanyHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/sub-rewards")
public class SubRewardQueryController {

    private final SubRewardByCompanyHandler subRewardByCompanyHandler;
    private final SubRewardAllByCompanyHandler subRewardAllByCompanyHandler;

    public SubRewardQueryController(SubRewardByCompanyHandler subRewardByCompanyHandler, SubRewardAllByCompanyHandler subRewardAllByCompanyHandler) {
        this.subRewardByCompanyHandler = subRewardByCompanyHandler;
        this.subRewardAllByCompanyHandler = subRewardAllByCompanyHandler;
    }

    @GetMapping("/{id}")
    public SubRewardDto getById(@PathVariable long id){
        return subRewardByCompanyHandler.execute(id);
    }

    @GetMapping("/companies/{companyId}/")
    public List<SubRewardDto> getAllByCompanyAndMainReward(@PathVariable long companyId){
        return subRewardAllByCompanyHandler.execute(companyId);
    }

}
