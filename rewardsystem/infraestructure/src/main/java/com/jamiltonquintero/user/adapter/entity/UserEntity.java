package com.jamiltonquintero.user.adapter.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jamiltonquintero.company.adapter.entity.CompanyEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "identification")
    private String identification;
    @Column(name = "total_points")
    private Integer totalPoints;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_company",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "company_id", referencedColumnName = "id")
    )
    private Set<CompanyEntity> companies;

    public UserEntity(String firstName, String lastName, String email, String identification, Integer totalPoints, Set<CompanyEntity> companies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
        this.totalPoints = totalPoints;
        this.companies = companies;
    }


}