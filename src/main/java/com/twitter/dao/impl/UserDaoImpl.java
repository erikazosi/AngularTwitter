package com.twitter.dao.impl;

import com.twitter.dao.UserDao;
import com.twitter.dto.FollowUserReqDTO;
import com.twitter.dto.FollowUserResDTO;
import com.twitter.dto.UnfollowUserReqDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.Follow;
import com.twitter.entity.User;
import com.twitter.repository.FollowRepo;
import com.twitter.responseDTO.AllUsersRespDTO;
import com.twitter.utils.FollowUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.twitter.repository.UserRepo;
import com.twitter.utils.UserUtils;

import java.util.List;


@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepo userRepo;


    @Autowired
    private FollowRepo fRepo;
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

    @Override
    public List<AllUsersRespDTO> findAllWithoutCurrentUser(Long id) {
        List<User> user= userRepo.findAllWithoutCurrentUser(id);
        List <AllUsersRespDTO> allUsersRespDTO = UserUtils.convertRespEntityToDTO(user);

        return allUsersRespDTO;

        }

    @Override
    public void followNewUser(FollowUserReqDTO followUserReqDTO) {
       Follow follow = FollowUtils.convertDTOToEntity(followUserReqDTO);
        fRepo.saveAndFlush(follow);
    }

    @Override
    public List<FollowUserResDTO> followingUsersList(Long id) {
        List<User> user = userRepo.findAllFollowingUsers(id);
        List<FollowUserResDTO> followUserResDTOList = UserUtils.convertFollowRespEntityToDTO(user);
        return followUserResDTOList;

    }

    @Override
    public List<FollowUserResDTO> followersList(Long id) {
        List<User> user = userRepo.findAllFollowers(id);

        List<FollowUserResDTO> followUserResDTOList = UserUtils.convertFollowRespEntityToDTO(user);

        return followUserResDTOList;
    }

    @Override
    public void unfollowUser(UnfollowUserReqDTO unfollowUserReqDTO) {
        Follow follow = FollowUtils.convertUnfollowDTOToEntity(unfollowUserReqDTO);
        userRepo.unfollowUser(follow.getFollowerId(),follow.getFollowingId());

    }
}



