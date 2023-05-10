package com.jamiltonquintero.user.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserEditCommand {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String identification;

}
