package com.twitter.service;


import com.twitter.dto.UserDTO;
import com.twitter.entity.User;
import com.twitter.requestDTO.LoginRequestDTO;
import com.twitter.requestDTO.UserRequestDTO;

import java.util.List;

public interface UserService {
    User verifyUser(LoginRequestDTO loginRequestDTO);

    void addUser(UserRequestDTO userRequestDTO);

    List<User> findAll();

    UserDTO findById(long id);

    void updateUser(UserDTO userDTO);

    void deleteUserById(long id);

}
