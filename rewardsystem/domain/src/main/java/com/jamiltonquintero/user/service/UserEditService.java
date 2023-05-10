package com.jamiltonquintero.user.service;

import com.jamiltonquintero.user.model.entity.User;
import com.jamiltonquintero.user.port.dao.UserDao;
import com.jamiltonquintero.user.port.repository.UserRepository;

import java.util.Optional;

public class UserEditService {

    private final UserRepository userRepository;
    private final UserDao userDao;

    public UserEditService(UserRepository userRepository, UserDao userDao) {
        this.userRepository = userRepository;
        this.userDao = userDao;
    }

    public void execute(User user, Long id){

        User userToToEdit  = getExistingUserOpt(id);

        validateFieldsToChange(user, id);

        userToToEdit.setFieldsToEdit(user.getFirstName(),user.getLastName(),user.getEmail(),user.getIdentification());

        userRepository.edit(userToToEdit);

    }

    private User getExistingUserOpt(Long id) {
        Optional<User> existingUserOpt = userDao.getByIdWhitCompanies(id);

        if (!existingUserOpt.isPresent()){
            throw new RuntimeException("");
        }
        return existingUserOpt.get();
    }

    private void validateFieldsToChange(User user, Long id) {
        Optional<User> userWithEmail = userDao.findByEmail(user.getEmail());
        if (userWithEmail.isPresent() && !userWithEmail.get().getId().equals(id)) {
            throw new IllegalArgumentException("Email already exists: " + user.getEmail());
        }

        Optional<User> userWithIdentification = userDao.getByIdentification(user.getIdentification());
        if (userWithIdentification.isPresent() && !userWithIdentification.get().getId().equals(id)) {
            throw new IllegalArgumentException("Identification already exists: " + user.getIdentification());
        }
    }
}
