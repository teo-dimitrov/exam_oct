package com.example.exam_oct.service;

import com.example.exam_oct.model.entity.User;
import com.example.exam_oct.model.service.UserServiceModel;

import java.util.List;

public interface UserService {
    UserServiceModel registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    User findById(long id);

    List<User> findAllUsersWithShips();

    List<User> findAllUsers();

}
