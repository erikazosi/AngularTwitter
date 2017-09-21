package com.twitter.service;

import com.twitter.dto.StoryDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.Story;
import com.twitter.requestDTO.UserStoryReqDTO;
import com.twitter.responseDTO.StoriesResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StoryService {


    List<Story> findAll();

    StoryDTO findById(long id);

    void updateStory(StoryDTO storyDTO);

    void deleteStoryById(long id);

    void addStory(UserStoryReqDTO userStoryReqDTO);

    List<StoriesResponseDTO> findStoryById(long id);
}
