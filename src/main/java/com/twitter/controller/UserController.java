package controller;

import core.Hash;
import dto.UserDTO;
import requestDTO.UserRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.UserService;
import service.impl.UserServiceImpl;

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

        return new ResponseEntity<String>("/dashboard", HttpStatus.OK);
    }

//    @GetMapping(value = "/signup")
//    public ResponseEntity<String> SignUp(Model model) {
//        model.addAttribute(new User());
//        return new ResponseEntity<String>("signup", HttpStatus.OK
//        );
//    }

    @PostMapping(value = "/signup")
    public  ResponseEntity<Void> processRegistration(@RequestBody UserRequestDTO userRequestDTO) {

       // UserDTO userDTO = UserUtils.convertRequestToDTO(users);
        UserRequestDTO usersDTO = Hash.hashPassword(userRequestDTO);
      //  userService.addUser(usersDTO);
        return new ResponseEntity<Void>(HttpStatus.OK);


    }

}
