package com.jamiltonquintero.configuration;

import com.jamiltonquintero.company.port.dao.CompanyDao;
import com.jamiltonquintero.user.port.dao.UserDao;
import com.jamiltonquintero.user.port.repository.UserRepository;
import com.jamiltonquintero.user.service.UserByCompanyService;
import com.jamiltonquintero.user.service.UserByIdService;
import com.jamiltonquintero.user.service.UserByIdentificationService;
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
    public UserByCompanyService userByCompanyService(
            UserDao userDao){
        return new UserByCompanyService(userDao);
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

}
