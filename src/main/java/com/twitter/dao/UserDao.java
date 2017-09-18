package com.twitter.dao;

import com.twitter.dto.UserDTO;
import com.twitter.entity.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> findAll();

    UserDTO findById(long id);

    void updateUser(UserDTO userDTO);

    void deleteUserById(long id);

    User findByUsername(String username);
}
