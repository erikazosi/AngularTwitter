package service;

import dto.StoryDTO;
import dto.UserDTO;
import entity.Story;

import java.util.List;

public interface StoryService {


    List<Story> findAll();

    StoryDTO findById(long id);

    void updateStory(StoryDTO storyDTO);

    void deleteStoryById(long id);

    UserDTO addStory(long id);
}
