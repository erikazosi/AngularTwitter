package com.twitter.responseDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserResponseDTO {
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

}
