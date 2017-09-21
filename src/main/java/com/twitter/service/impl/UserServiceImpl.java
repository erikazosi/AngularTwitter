package com.twitter.service.impl;

import com.twitter.core.Hash;
import com.twitter.dao.UserDao;
import com.twitter.dto.*;
import com.twitter.entity.User;
import com.twitter.requestDTO.LoginRequestDTO;
import com.twitter.requestDTO.UserRequestDTO;
import com.twitter.responseDTO.AllUsersRespDTO;
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

    public User verifyUser(LoginRequestDTO loginRequestDTO) {
        User user = userDao.findByUsername(loginRequestDTO.getUsername());


        boolean hashing = Hash.unhashPassword(loginRequestDTO.getPassword(), user.getPassword());

        if (hashing) {
            return user;
        } else
            return null;
    }

    public void addUser(UserRequestDTO userRequestDTO) {

        User user = UserUtils.convertDTOToEntity(userRequestDTO);
        userDao.addUser(user);
    }

    public List<User> findAll() {
        return null;
    }

    @Override
    public UserDTO findById(long id) {
        UserDTO userDTO = userDao.findById(id);
        return userDTO;

    }

    public UserDTO findById(int id) {
        return null;
    }

    public void updateUser(UserDTO userDTO) {

    }

    @Override
    public void deleteUserById(long id) {

    }

    @Override
    public List<AllUsersRespDTO> findAllWithoutCurrentUser(Long id) {
        List<AllUsersRespDTO> allUsersRespDTOS = userDao.findAllWithoutCurrentUser(id);
        return allUsersRespDTOS;
    }

    @Override
    public void followNewUser(FollowUserReqDTO followUserReqDTO) {
        userDao.followNewUser(followUserReqDTO);
    }

    @Override
    public List<FollowUserResDTO> followingUsersList(Long id) {
        List<FollowUserResDTO> followUserResDTOList = userDao.followingUsersList(id);
        return followUserResDTOList;
    }

    @Override
    public List<FollowUserResDTO> followersList(Long id) {
        List<FollowUserResDTO> followUserResDTOList = userDao.followersList(id);
        return followUserResDTOList;
    }

    @Override
    public void unfollowUser(UnfollowUserReqDTO unfollowUserReqDTO) {
        userDao.unfollowUser(unfollowUserReqDTO);

    }

    public void deleteUserById(int id) {

    }
}
