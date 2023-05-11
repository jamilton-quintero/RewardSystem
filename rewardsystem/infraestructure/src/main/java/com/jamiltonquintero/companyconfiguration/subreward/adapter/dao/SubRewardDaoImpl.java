package com.jamiltonquintero.companyconfiguration.subreward.adapter.dao;

import com.jamiltonquintero.companyconfiguration.subreward.adapter.mapper.SubRewardDboMapper;
import com.jamiltonquintero.companyconfiguration.subreward.adapter.SubRewardJpaRepository;
import com.jamiltonquintero.companyconfiguration.subreward.model.entity.SubReward;
import com.jamiltonquintero.companyconfiguration.subreward.port.dao.SubRewardDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SubRewardDaoImpl implements SubRewardDao {


    private final SubRewardJpaRepository subRewardJpaRepository;
    private final SubRewardDboMapper subRewardDboMapper;

    public SubRewardDaoImpl(SubRewardJpaRepository subRewardJpaRepository, SubRewardDboMapper subRewardDboMapper) {
        this.subRewardJpaRepository = subRewardJpaRepository;
        this.subRewardDboMapper = subRewardDboMapper;
    }

    @Override

    public Optional<SubReward> getById(Long id) {
        return subRewardJpaRepository.findById(id)
                .map(subRewardDboMapper::toDomain);
    }

    @Override
    public Optional<SubReward> getByCompany(Long companyId) {
        return null;
//        return subRewardJpaRepository.findByCompanyId(companyId)
//                .map(subRewardDboMapper::toDomain);
    }

    @Override
    public List<SubReward> getAllByCompany(Long companyId) {
        return subRewardJpaRepository.findAllByCompanyId(companyId)
                .stream()
                .map(subRewardDboMapper::toDomain)
                .collect(Collectors.toList());
    }

}
