package com.jamiltonquintero.beanconfiguration;

import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.companyconfiguration.reward.port.dao.RewardDao;
import com.jamiltonquintero.user.port.dao.UserDao;
import com.jamiltonquintero.user.port.repository.UserRepository;
import com.jamiltonquintero.user.service.UserAddRewardsService;
import com.jamiltonquintero.user.service.UserSummaryAllByCompanyService;
import com.jamiltonquintero.user.service.UserByIdService;
import com.jamiltonquintero.user.service.UserByIdentificationService;
import com.jamiltonquintero.user.service.UserEditService;
import com.jamiltonquintero.user.service.UserRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBean {

    @Bean
    public UserRegisterService userRegisterService(
            UserRepository userRepository,
            CompanyDao companyDao){
        return new UserRegisterService(userRepository, companyDao);
    }

    @Bean
    public UserSummaryAllByCompanyService userSummaryAllByCompanyService(
            UserDao userDao){
        return new UserSummaryAllByCompanyService(userDao);
    }

    @Bean
    public UserByIdentificationService userByIdentificationService(
            UserDao userDao){
        return new UserByIdentificationService(userDao);
    }

    @Bean
    public UserByIdService userByIdService(
            UserDao userDao){
        return new UserByIdService(userDao);
    }

    @Bean
    public UserEditService userEditService(
            UserRepository userRepository,
            UserDao userDao){

        return new UserEditService(userRepository, userDao);
    }

    @Bean
    public UserAddRewardsService userAddRewardsService(
            UserRepository userRepository,
            UserDao userDao,
            RewardDao rewardDao){

        return new UserAddRewardsService(userRepository, userDao,rewardDao);

    }

}
