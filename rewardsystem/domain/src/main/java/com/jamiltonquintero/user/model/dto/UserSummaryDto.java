package com.jamiltonquintero.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserSummaryDto {

    private Long id;
    private String fullName;
    private String email;
    private String identification;

}
