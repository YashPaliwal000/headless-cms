package com.headless.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.headless.cms.dao.UserRepository;
import com.headless.cms.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }


    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    //todo user authentication and role based access

    public boolean authenticate(String username, String password) {
        // Retrieve user from the database
        User user = userRepository.findByUsername(username);
        if (user == null) {
            // User not found
            return false;
        }

        // Compare passwords
        return passwordEncoder.matches(password, user.getPassword());
    }
}
