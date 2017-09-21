package com.twitter.utils;

import com.twitter.dto.FollowUserResDTO;
import com.twitter.dto.LoginDTO;
import com.twitter.dto.UnfollowUserReqDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.User;
import com.twitter.requestDTO.UserRequestDTO;
import com.twitter.responseDTO.AllUsersRespDTO;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {
    public static UserDTO convertRequestToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());

        return userDTO;

    }

    public static LoginDTO convertLoginRequestToDTO(User user) {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUsername(user.getUsername());
        loginDTO.setPassword(user.getPassword());
        return loginDTO;
    }

    public static UserDTO convertEntityToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setPassword(user.getPassword());

        userDTO.setId(user.getId());

        return userDTO;
    }

    public static User convertDTOToEntity(UserRequestDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());

        return user;

    }

    public static List<AllUsersRespDTO> convertRespEntityToDTO(List<User> user) {
        List<AllUsersRespDTO> allUsersRespDTOS = new ArrayList<>();
        for (User li : user) {
            AllUsersRespDTO allUsersRespDTO = new AllUsersRespDTO();
            allUsersRespDTO.setFirstName(li.getFirstName());
            allUsersRespDTO.setLastName(li.getLastName());
            allUsersRespDTO.setId(li.getId());
            allUsersRespDTOS.add(allUsersRespDTO);

        }
        return allUsersRespDTOS;

    }

    public static List<FollowUserResDTO> convertFollowRespEntityToDTO(List<User> users) {
        List<FollowUserResDTO> followUserResDTOList = new ArrayList<>();
        for (User li : users) {

            FollowUserResDTO followUserResDTO = new FollowUserResDTO();
            followUserResDTO.setId(li.getId());
            followUserResDTO.setFirstName(li.getFirstName());
            followUserResDTO.setLastName(li.getLastName());
            followUserResDTOList.add(followUserResDTO);

        }
        return followUserResDTOList;
    }

}

