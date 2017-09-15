package dao;

import dto.UserDTO;
import entity.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> findAll();

    UserDTO findById(long id);

    void updateUser(UserDTO userDTO);

    void deleteUserById(long id);

}
