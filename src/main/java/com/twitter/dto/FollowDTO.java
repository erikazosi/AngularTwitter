package dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter

public class FollowDTO {

    private long id;
    private long followingId;
    private long followerId;
}
