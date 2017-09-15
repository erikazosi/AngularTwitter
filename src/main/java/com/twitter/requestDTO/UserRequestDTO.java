package com.twitter.requestDTO;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserRequestDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;


}
