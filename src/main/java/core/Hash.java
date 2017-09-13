package core;

import dto.LoginDTO;
import dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class Hash {

    public static UserDTO hashPassword(UserDTO userDTO) {
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
