package com.twitter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Getter
@Setter
@Entity
public class Story {
    @Id
    @GeneratedValue
    private long storyId;
    private String story;
    private long userId;
    private Date storyCreatedDate;
}
