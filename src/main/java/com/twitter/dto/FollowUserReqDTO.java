package com.twitter.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FollowUserReqDTO {
    private Long followerId;
    private Long followingId;
    private String followingName;
}
