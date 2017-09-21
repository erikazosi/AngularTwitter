package com.twitter.controller;

import com.twitter.dto.FollowUserReqDTO;
import com.twitter.dto.FollowUserResDTO;
import com.twitter.dto.UnfollowUserReqDTO;
import com.twitter.service.UserService;
import com.twitter.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/follow")
public class FollowController {
    public UserService userService;

    public FollowController(UserServiceImpl userServiceImpl
    ) {
        this.userService = userServiceImpl;
    }


    @PostMapping("/followNewUser")
    public void followNewUser(@RequestBody FollowUserReqDTO followUserReqDTO) {
        userService.followNewUser(followUserReqDTO);

    }

    @GetMapping("/followingUsers/{userId}")
    public ResponseEntity<List<FollowUserResDTO>> followingUsersList(@PathVariable("userId") Long id) {

        List<FollowUserResDTO> followUserResDTOList = userService.followingUsersList(id);

        return new ResponseEntity<List<FollowUserResDTO>>(followUserResDTOList, HttpStatus.OK);
    }

    @GetMapping("/followers/{userId}")
    public ResponseEntity<List<FollowUserResDTO>> followerUsersList(@PathVariable("userId") Long id) {

        List<FollowUserResDTO> followUserResDTOList = userService.followersList(id);

        return new ResponseEntity<List<FollowUserResDTO>>(followUserResDTOList, HttpStatus.OK);


    }

    @PostMapping("/unfollow")
    public void unfollowUser(@RequestBody UnfollowUserReqDTO unfollowUserReqDTO) {
        userService.unfollowUser(unfollowUserReqDTO);
    }
}
