package controller;

import dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import service.StoryService;
import service.UserService;
import service.impl.StoryServiceImpl;
import service.impl.UserServiceImpl;

@Controller
public class StoryController {
    private UserService userService;
    private StoryService storyService;

    public StoryController(UserServiceImpl userServiceImpl, StoryServiceImpl storyServiceImpl) {
        this.userService = userServiceImpl;
        this.storyService = storyServiceImpl;
    }

    @GetMapping("/addStory/{userId}")
    public ResponseEntity<Void> addStoryForm(@PathVariable("userId") long id) {
        UserDTO userDTo = storyService.addStory(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @GetMapping("editStory/{userId}")
    public ResponseEntity<Void> editStory(@PathVariable("userId") long id){
        return new ResponseEntity<Void>(HttpStatus.OK);
    }



}
