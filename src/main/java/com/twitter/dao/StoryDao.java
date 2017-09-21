package com.twitter.dao;

import com.twitter.entity.Story;
import com.twitter.responseDTO.StoriesResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StoryDao {
    public void addStory(Story story);

    public List<StoriesResponseDTO> findStoryById(Long id);
}
