package com.twitter.service;


import com.twitter.dto.LoginDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.User;

import java.util.List;

public interface UserService {
    boolean verifyUser(LoginDTO loginDTO);

    void addUser(UserDTO userDTO);

    List<User> findAll();

    UserDTO findById(long id);

    void updateUser(UserDTO userDTO);

    void deleteUserById(long id);

}
