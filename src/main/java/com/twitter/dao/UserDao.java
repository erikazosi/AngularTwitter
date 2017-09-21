package com.twitter.dao;

import com.twitter.dto.FollowUserReqDTO;
import com.twitter.dto.FollowUserResDTO;
import com.twitter.dto.UnfollowUserReqDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.User;
import com.twitter.responseDTO.AllUsersRespDTO;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> findAll();

    UserDTO findById(long id);

    void updateUser(UserDTO userDTO);

    void deleteUserById(long id);

    User findByUsername(String username);

    List<AllUsersRespDTO> findAllWithoutCurrentUser(Long id);

    void followNewUser(FollowUserReqDTO followUserReqDTO);

    List<FollowUserResDTO> followingUsersList(Long id);

    List<FollowUserResDTO> followersList(Long id);

    void unfollowUser(UnfollowUserReqDTO unfollowUserReqDTO);
}
