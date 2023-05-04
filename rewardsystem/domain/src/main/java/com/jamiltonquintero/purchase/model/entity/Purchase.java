package com.jamiltonquintero.purchase.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
    private Long id;
    private LocalDate date;
    private BigDecimal amount;
    private Long userId;
}