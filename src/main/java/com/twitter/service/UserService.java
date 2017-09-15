package service;

import dto.LoginDTO;
import dto.UserDTO;
import entity.User;

import java.util.List;

public interface UserService {
    boolean verifyUser(LoginDTO loginDTO);

    void addUser(UserDTO userDTO);

    List<User> findAll();

    UserDTO findById(long id);

    void updateUser(UserDTO userDTO);

    void deleteUserById(long id);

}
