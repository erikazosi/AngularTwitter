package com.twitter.core;

import com.twitter.dto.LoginDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.User;
import com.twitter.requestDTO.LoginRequestDTO;
import com.twitter.requestDTO.UserRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class Hash {

    public static UserRequestDTO hashPassword(UserRequestDTO userDTO) {
        String hashed = BCrypt.hashpw(userDTO.getPassword(), BCrypt.gensalt(12));

        userDTO.setPassword(hashed);
        return userDTO;
    }

    public static boolean unhashPassword(String plainTextPassword, String hashedPassword) {
        if (BCrypt.checkpw(plainTextPassword, hashedPassword)) {
            return true;

        } else
            return false;
    }


}
