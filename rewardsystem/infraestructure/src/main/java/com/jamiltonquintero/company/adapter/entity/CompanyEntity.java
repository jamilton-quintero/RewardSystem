package com.jamiltonquintero.company.adapter.entity;

import com.jamiltonquintero.companyconfiguration.reward.adapter.entity.RewardEntity;
import com.jamiltonquintero.companyconfiguration.subreward.adapter.entity.SubRewardEntity;
import com.jamiltonquintero.user.adapter.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "company")
@Entity
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @ManyToMany(mappedBy = "companies", fetch = FetchType.LAZY)
    private Set<UserEntity> users;
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RewardEntity> rewards = new ArrayList<>();
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubRewardEntity> subRewards = new ArrayList<>();

    public CompanyEntity(String name, String email, String password, LocalDate creationDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.creationDate = creationDate;
    }

    public CompanyEntity(Long id, String name, String email, String password, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.creationDate = creationDate;
    }

}