package com.twitter.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
    private long userId;
    private String username;
    private String password;
}
