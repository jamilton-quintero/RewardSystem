package com.jamiltonquintero.redemption.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class Redemption {
    private Long id;
    private LocalDate date;
    private Long userId;
    private Long rewardId;
}