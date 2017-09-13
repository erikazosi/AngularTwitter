package service.impl;

import core.Hash;
import dao.UserDao;
import dto.LoginDTO;
import dto.UserDTO;
import entity.User;
import service.UserService;
import utils.UserUtils;

import java.util.List;

public class UserServiceImpl implements UserService {



    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    public boolean verifyUser(LoginDTO loginDTO) {
        UserDTO userDTO=userDao.findById(loginDTO.getUserId());

        boolean hashing=Hash.unhashPassword(userDTO, loginDTO);

        return hashing;
    }

    public void addUser(UserDTO userDTO) {

        User user = UserUtils.convertDTOToEntity(userDTO);
       userDao.addUser(user);
    }

    public List<User> findAll() {
        return null;
    }

    public UserDTO findById(int id) {
        return null;
    }

    public void updateUser(UserDTO userDTO) {

    }

    public void deleteUserById(int id) {

    }
}
