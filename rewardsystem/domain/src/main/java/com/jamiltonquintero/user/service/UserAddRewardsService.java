package com.jamiltonquintero.user.service;

import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import com.jamiltonquintero.companyconfiguration.reward.port.dao.RewardDao;
import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.port.dao.UserDao;
import com.jamiltonquintero.user.port.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserAddRewardsService {

    private final UserRepository userRepository;
    private final UserDao userDao;
    private final RewardDao rewardDao;

    public UserAddRewardsService(UserRepository userRepository, UserDao userDao, RewardDao rewardDao) {
        this.userRepository = userRepository;
        this.userDao = userDao;
        this.rewardDao = rewardDao;
    }

    public void execute(Long id, List<Long> rewardsIds){

        Optional<User> user = userDao.getById(id);

        if (!user.isPresent()){
            throw new RuntimeException("");
        }

        User userToUpdate = user.get();
        List<Reward> rewards = rewardDao.getByIds(rewardsIds);

        if (rewards.size() != rewardsIds.size()){
            throw new RuntimeException("");
        }

        userToUpdate.addRewards(rewards);
        userRepository.edit(userToUpdate);

    }
}
