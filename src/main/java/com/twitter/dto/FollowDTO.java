package com.twitter.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FollowDTO {

    private long id;
    private long followingId;
    private long followerId;
}
