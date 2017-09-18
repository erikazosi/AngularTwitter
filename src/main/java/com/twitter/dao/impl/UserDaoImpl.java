package com.twitter.dao.impl;

import com.twitter.dao.UserDao;
import com.twitter.dto.UserDTO;
import com.twitter.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.twitter.repository.UserRepo;
import com.twitter.utils.UserUtils;

import java.util.List;


@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepo userRepo;
    public void addUser(User user) {

        userRepo.saveAndFlush(user);
    }

    public List<User> findAll() {
        return null;
    }


    @Override
    public UserDTO findById(long id) {
        User user = userRepo.findOne(id);

        UserDTO userDTO = UserUtils.convertEntityToDTO(user);

        return userDTO;
    }

    public void updateUser(UserDTO userDTO) {

    }

    public void deleteUserById(long id) {

    }

    @Override
    public User findByUsername(String username) {

        User user = userRepo.findByUsername(username);


        return user;
    }


}
