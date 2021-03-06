package com.twitter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Follow {
    @Id
    @GeneratedValue
    private long id;
    private long followingId;
    private long followerId;
    private String followingName;

}
