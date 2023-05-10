package com.jamiltonquintero.user.command.handler;

import com.jamiltonquintero.user.port.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserDeleteHandler {

    private final UserRepository userRepository;

    public UserDeleteHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(Long id){
        userRepository.delete(id);
    }

}
