package com.ropafadzom.examapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import com.ropafadzom.examapp.models.User;
import com.ropafadzom.examapp.repositories.UserRepository;
import com.ropafadzom.examapp.repositories.RoleRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
     
    
    public List<User> findAll() {
		return userRepository.findAll();
	}
    
}

