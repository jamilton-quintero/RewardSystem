package com.jamiltonquintero.user.adapter.dao;

import com.jamiltonquintero.user.adapter.UserJpaRepository;
import com.jamiltonquintero.user.adapter.mapper.UserDboMapper;
import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.port.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserDaoImpl implements UserDao {

    private final UserJpaRepository userJpaRepository;
    private final UserDboMapper userDboMapper;

    public UserDaoImpl(UserJpaRepository userJpaRepository, UserDboMapper userDboMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userDboMapper = userDboMapper;
    }

    @Override

    public Optional<User> getById(Long id) {
        return userJpaRepository.findById(id)
                .map(userDboMapper::toDomain);
    }

    @Override
    public Optional<User> getByIdentification(String identification) {
        return userJpaRepository.findByIdentification(identification)
                .map(userDboMapper::toDomain);
    }

    @Override
    public List<User> getByCompany(Long companyId) {
        return userJpaRepository.findAllByCompaniesId(companyId)
                .stream()
                .map(userDboMapper::toDomain).collect(Collectors.toList());
    }
}
