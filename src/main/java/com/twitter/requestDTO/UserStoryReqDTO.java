package com.twitter.requestDTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserStoryReqDTO {

    private String story;
    private long userId;
}
