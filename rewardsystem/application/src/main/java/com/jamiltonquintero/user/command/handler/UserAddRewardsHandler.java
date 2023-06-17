package com.jamiltonquintero.user.command.handler;

import com.jamiltonquintero.user.service.UserAddRewardsService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAddRewardsHandler {

    private final UserAddRewardsService userAddRewardsService;

    public UserAddRewardsHandler(UserAddRewardsService userAddRewardsService) {
        this.userAddRewardsService = userAddRewardsService;
    }

    public void execute(Long id, List<Long> rewardsIds){
        userAddRewardsService.execute(id, rewardsIds);
    }

}
