package controller;

import core.Hash;
import dto.UserDTO;
import entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.UserService;
import service.impl.UserServiceImpl;
import utils.UserUtils;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    public UserService userService;

    public UserController(UserServiceImpl userServiceImpl
    ) {
        this.userService = userServiceImpl;
    }

    @GetMapping(value = "/loginSuccess")
    public ResponseEntity<String> loginSuccess(Model model) {


        List li = userService.findAll();
      //  List<UserDTO> userDTO = UserUtils.convertToDashboardDTO(li);
       // model.addAttribute("list", userDTO);

        return new ResponseEntity<String>("Dashboard", HttpStatus.OK);
    }

    @GetMapping(value = "/signup")
    public ResponseEntity<String> SignUp(Model model) {
        model.addAttribute(new User());
        return new ResponseEntity<String>("signup", HttpStatus.OK
        );
    }

    @PostMapping(value = "/signup")
    public String processRegistration(@RequestBody User users) {

        UserDTO userDTO = UserUtils.convertRequestToDTO(users);
        UserDTO usersDTO = Hash.hashPassword(userDTO);
        userService.addUser(usersDTO);
        return "redirect:/home";


    }

}
