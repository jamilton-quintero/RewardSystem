package com.jamiltonquintero.reward.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Reward {
    private Long id;
    private String name;
    private Integer requiredPoints;
    private Long companyId;
}