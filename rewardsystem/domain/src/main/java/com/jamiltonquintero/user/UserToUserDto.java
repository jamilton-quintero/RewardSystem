package com.jamiltonquintero.user;

import com.jamiltonquintero.user.model.dto.UserDto;
import com.jamiltonquintero.user.model.entity.User;

public class UserToUserDto {

    public static UserDto execute(User user){
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getIdentification(),
                user.getTotalPoints());
    }

}
