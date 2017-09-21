package com.twitter.responseDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginSuccessRespDTO {
    private long id;
    private String token;
}
