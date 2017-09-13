package dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter

public class StoryDTO {

    private long storyId;
    private String story;
    private long userId;
}
