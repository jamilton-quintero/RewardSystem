package com.jamiltonquintero.user.adapter.repository;

import com.jamiltonquintero.user.adapter.UserJpaRepository;
import com.jamiltonquintero.user.adapter.entity.UserEntity;
import com.jamiltonquintero.user.adapter.mapper.UserDboMapper;
import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.model.entity.UserToRegister;
import com.jamiltonquintero.user.port.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserDboMapper userDboMapper;
    public UserRepositoryImpl(UserJpaRepository userJpaRepository, UserDboMapper userDboMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userDboMapper = userDboMapper;
    }

    @Override
    public Long create(UserToRegister user) {
        UserEntity userDbo = userDboMapper.toDboRegister(user);
        UserEntity savedUser = userJpaRepository.save(userDbo);
        return savedUser.getId();
    }

    @Override
    public void edit(User user) {
        UserEntity userDbo = userDboMapper.toDbo(user);
        userJpaRepository.save(userDbo);
    }

    @Override
    public void delete(Long id) {
        userJpaRepository.deleteById(id);
    }

}
