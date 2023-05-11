package com.jamiltonquintero.beanconfiguration;

import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.companyconfiguration.subreward.port.dao.SubRewardDao;
import com.jamiltonquintero.companyconfiguration.subreward.port.repository.SubRewardRepository;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardAllByCompanyService;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardByCompanyService;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardByIdService;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardEditService;
import com.jamiltonquintero.companyconfiguration.subreward.service.SubRewardRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanySubRewardBean {

    @Bean
    public SubRewardRegisterService subRewardRegisterService(
            SubRewardRepository rewardRepository,
            CompanyDao companyDao){
        return new SubRewardRegisterService(rewardRepository, companyDao);
    }

    @Bean
    public SubRewardByIdService subRewardByIdService(
            SubRewardDao rewardDao){
        return new SubRewardByIdService(rewardDao);
    }

    @Bean
    public SubRewardByCompanyService subRewardByCompanyService(
            SubRewardDao rewardDao){
        return new SubRewardByCompanyService(rewardDao);
    }

    @Bean
    public SubRewardAllByCompanyService subRewardAllByCompanyService(
            SubRewardDao rewardDao){
        return new SubRewardAllByCompanyService(rewardDao);
    }

    @Bean
    public SubRewardEditService subRewardEditService(
            SubRewardRepository rewardRepository,
            SubRewardDao rewardDao){
        return new SubRewardEditService(rewardRepository, rewardDao);
    }

}
