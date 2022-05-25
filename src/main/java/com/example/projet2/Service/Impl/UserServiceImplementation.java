package com.example.projet2.Service.Impl;


import com.example.projet2.Model.User;
import com.example.projet2.Repository.UserRepository;
import com.example.projet2.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public Optional<User> readOneUser(String usernName) {
        return userRepository.findByUsername(usernName);
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

}
