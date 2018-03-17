package by.itacademy.service;

import by.itacademy.entity.User;
import by.itacademy.exceptions.UserExistException;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    void newUserRegistration(User user) throws UserExistException;
}
