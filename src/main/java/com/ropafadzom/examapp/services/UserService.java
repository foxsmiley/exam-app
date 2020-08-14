package com.ropafadzom.examapp.services;
import com.ropafadzom.examapp.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
