package com.twitter.service.impl;

import com.twitter.dto.StoryDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.Story;
import com.twitter.service.StoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryServiceImpl implements StoryService {
    @Override
    public List<Story> findAll() {
        return null;
    }

    @Override
    public StoryDTO findById(long id) {
        return null;
    }

    @Override
    public void updateStory(StoryDTO storyDTO) {

    }

    @Override
    public void deleteStoryById(long id) {

    }

    @Override
    public UserDTO addStory(long id) {
        return null;
    }
}
