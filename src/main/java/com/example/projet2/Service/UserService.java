package com.example.projet2.Service;

import com.example.projet2.Model.User;

import java.util.Optional;

public interface UserService {

    User createUser(User user);

    Optional<User> readOneUser(String usernName);

    Optional<User> findById(int id);

    void deleteUser(User user);

}
