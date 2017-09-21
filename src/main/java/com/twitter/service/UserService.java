package com.twitter.service;


import com.twitter.dto.FollowUserReqDTO;
import com.twitter.dto.FollowUserResDTO;
import com.twitter.dto.UnfollowUserReqDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.User;
import com.twitter.requestDTO.LoginRequestDTO;
import com.twitter.requestDTO.UserRequestDTO;
import com.twitter.responseDTO.AllUsersRespDTO;

import java.util.List;

public interface UserService {
    User verifyUser(LoginRequestDTO loginRequestDTO);

    void addUser(UserRequestDTO userRequestDTO);

    List<User> findAll();

    UserDTO findById(long id);

    void updateUser(UserDTO userDTO);

    void deleteUserById(long id);

    List<AllUsersRespDTO> findAllWithoutCurrentUser(Long id);

    void followNewUser(FollowUserReqDTO followUserReqDTO);

    List<FollowUserResDTO> followingUsersList(Long id);
    List<FollowUserResDTO> followersList(Long id);


    void unfollowUser(UnfollowUserReqDTO unfollowUserReqDTO);
}
