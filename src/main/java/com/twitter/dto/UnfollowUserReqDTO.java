package com.twitter.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnfollowUserReqDTO {
    private Long followerId;
    private Long followingId;
}
