package com.twitter.controller;

import com.twitter.core.Hash;
import com.twitter.dto.UserDTO;
import com.twitter.entity.User;
import com.twitter.requestDTO.LoginRequestDTO;
import com.twitter.requestDTO.UserIdRequestDTO;
import com.twitter.requestDTO.UserRequestDTO;
import com.twitter.responseDTO.LoginSuccessDTO;
import com.twitter.responseDTO.UserResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.twitter.service.UserService;
import com.twitter.service.impl.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    public UserService userService;

    public UserController(UserServiceImpl userServiceImpl
    ) {
        this.userService = userServiceImpl;
    }

    @GetMapping("/loginSuccess/{userId}")
    public ResponseEntity<UserDTO> loginSuccess(@PathVariable("userId") Long userId) {


      UserDTO userDTO= userService.findById(userId);


        return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
    }

//    @GetMapping(value = "/signup")
//    public ResponseEntity<String> SignUp(Model model) {
//        model.addAttribute(new User());
//        return new ResponseEntity<String>("signup", HttpStatus.OK
//        );
//    }

    @PostMapping(value = "/signup")
    public ResponseEntity<Void> processRegistration(@RequestBody UserRequestDTO userRequestDTO) {

        System.out.println(userRequestDTO.getPassword());

        // UserDTO userDTO = UserUtils.convertRequestToDTO(users);
        UserRequestDTO usersDTO = Hash.hashPassword(userRequestDTO);
        userService.addUser(usersDTO);
        return new ResponseEntity<Void>(HttpStatus.OK);


    }

    @PostMapping(value = "/login")
    public ResponseEntity<LoginSuccessDTO> processLogin(@RequestBody LoginRequestDTO loginRequestDTO) {

        LoginSuccessDTO loginSuccessDTO = new LoginSuccessDTO();
        User user = userService.verifyUser(loginRequestDTO);
        if (user!=null) {

           loginSuccessDTO.setId(user.getId());

            return new ResponseEntity<LoginSuccessDTO>(loginSuccessDTO, HttpStatus.OK);
        } else
            return new ResponseEntity<LoginSuccessDTO>(HttpStatus.FORBIDDEN);


    }

}
