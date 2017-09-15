package com.twitter.service.impl;

import com.twitter.core.Hash;
import com.twitter.dao.UserDao;
import com.twitter.dto.LoginDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.User;
import com.twitter.service.UserService;
import com.twitter.utils.UserUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public UserDTO findById(long id) {
        return null;
    }

    public UserDTO findById(int id) {
        return null;
    }

    public void updateUser(UserDTO userDTO) {

    }

    @Override
    public void deleteUserById(long id) {

    }

    public void deleteUserById(int id) {

    }
}
