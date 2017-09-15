package com.twitter.controller;


import com.twitter.dto.LoginDTO;
import com.twitter.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.twitter.service.UserService;
import com.twitter.utils.UserUtils;


@RestController
@RequestMapping("/")
public class HomeController {
    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/home")
    public ResponseEntity<String> Home(Model model) {


        return new ResponseEntity<String>("home", HttpStatus.OK);
    }

    @PostMapping(value = "/home")
    public ResponseEntity<String> processLogin(@RequestBody User user) {
        LoginDTO loginDTO = UserUtils.convertLoginRequestToDTO(user);
        if (userService.verifyUser(loginDTO)) {
            return new ResponseEntity<String>("verified", HttpStatus.OK);
        }

else
        return new ResponseEntity<String>("/home", HttpStatus.OK);


    }

}
