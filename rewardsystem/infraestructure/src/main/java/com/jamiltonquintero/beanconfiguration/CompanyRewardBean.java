package com.jamiltonquintero.beanconfiguration;

import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.companyconfiguration.reward.port.dao.RewardDao;
import com.jamiltonquintero.companyconfiguration.reward.port.repository.RewardRepository;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardAllByCompanyService;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardByCompanyService;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardByIdService;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardEditService;
import com.jamiltonquintero.companyconfiguration.reward.service.RewardRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyRewardBean {

    @Bean
    public RewardRegisterService rewardRegisterService(
            RewardRepository rewardRepository,
            CompanyDao companyDao){
        return new RewardRegisterService(rewardRepository, companyDao);
    }

    @Bean
    public RewardByIdService rewardByIdService(
            RewardDao rewardDao){
        return new RewardByIdService(rewardDao);
    }

    @Bean
    public RewardByCompanyService rewardByCompanyService(
            RewardDao rewardDao){
        return new RewardByCompanyService(rewardDao);
    }

    @Bean
    public RewardAllByCompanyService rewardAllByCompanyService(
            RewardDao rewardDao){
        return new RewardAllByCompanyService(rewardDao);
    }

    @Bean
    public RewardEditService rewardEditService(
            RewardRepository rewardRepository,
            RewardDao rewardDao){
        return new RewardEditService(rewardRepository, rewardDao);
    }

}
