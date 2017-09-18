package com.twitter.utils;

import com.twitter.dto.LoginDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.User;
import com.twitter.requestDTO.UserRequestDTO;

public class UserUtils {
    public static UserDTO convertRequestToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());

        return userDTO;

    }

    public static LoginDTO convertLoginRequestToDTO(User user) {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUsername(user.getUsername());
        loginDTO.setPassword(user.getPassword());
        return loginDTO;
    }

    public static UserDTO convertEntityToDTO(User user) {
        UserDTO userDTO= new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setPassword(user.getPassword());

        userDTO.setId(user.getId());

        return userDTO;
    }

    public static User convertDTOToEntity(UserRequestDTO userDTO) {
        User  user= new User();
        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());

      return user;

    }
}
