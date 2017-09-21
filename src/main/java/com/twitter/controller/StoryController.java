package com.twitter.controller;

import com.twitter.dto.UserDTO;
import com.twitter.requestDTO.UserStoryReqDTO;
import com.twitter.responseDTO.StoriesResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.twitter.service.StoryService;
import com.twitter.service.UserService;
import com.twitter.service.impl.StoryServiceImpl;
import com.twitter.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class StoryController {
    private UserService userService;
    private StoryService storyService;

    public StoryController(UserServiceImpl userServiceImpl, StoryServiceImpl storyServiceImpl) {
        this.userService = userServiceImpl;
        this.storyService = storyServiceImpl;
    }

    @PostMapping("/addStory")
    public ResponseEntity<Void> addStoryForm(@RequestBody UserStoryReqDTO userStoryReqDTO) {

        storyService.addStory(userStoryReqDTO);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @GetMapping("editStory/{userId}")
    public ResponseEntity<Void> editStory(@PathVariable("userId") long id) {
        System.out.println("here");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("displayStory/{userId}")
    public ResponseEntity<List<StoriesResponseDTO>> displayStory(@PathVariable("userId") Long id){


       List<StoriesResponseDTO> storiesResponseDTOS=storyService.findStoryById(id);

        return new ResponseEntity<List<StoriesResponseDTO>>(storiesResponseDTOS,HttpStatus.OK);
    }


}
