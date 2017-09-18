package com.twitter.requestDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDTO {
    private Long id;
    private String username;
    private String password;
}
