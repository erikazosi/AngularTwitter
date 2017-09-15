package com.twitter.core;

import com.twitter.dto.LoginDTO;
import com.twitter.dto.UserDTO;
import com.twitter.requestDTO.UserRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class Hash {

    public static UserRequestDTO hashPassword(UserRequestDTO userDTO) {
        String hashed = BCrypt.hashpw(userDTO.getPassword(), BCrypt.gensalt(12));

        userDTO.setPassword(hashed);
        return userDTO;
    }

    public static boolean unhashPassword(UserDTO userDTO, LoginDTO loginDTO) {
        if (BCrypt.checkpw(loginDTO.getPassword(), userDTO.getPassword())) {
            return true;

        }

        else
            return false;
    }


}
