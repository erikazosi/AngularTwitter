package com.twitter.utils;

import com.twitter.dto.FollowUserReqDTO;
import com.twitter.dto.UnfollowUserReqDTO;
import com.twitter.entity.Follow;
import com.twitter.entity.User;

public class FollowUtils {
    public static Follow convertDTOToEntity(FollowUserReqDTO followUserReqDTO) {

        System.out.println("eager");
        Follow follow = new Follow();
        follow.setFollowerId(followUserReqDTO.getFollowerId());
        follow.setFollowingId(followUserReqDTO.getFollowingId());
        follow.setFollowingName(followUserReqDTO.getFollowingName());

        return follow;
    }

    public static Follow convertUnfollowDTOToEntity(UnfollowUserReqDTO unfollowUserReqDTO) {
        Follow follow = new Follow();
        follow.setFollowingId(unfollowUserReqDTO.getFollowingId());
        follow.setFollowerId(unfollowUserReqDTO.getFollowerId());
        return follow;


    }
}
