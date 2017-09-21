package com.twitter.dao.impl;

import com.twitter.dao.StoryDao;
import com.twitter.entity.Story;
import com.twitter.repository.StoryRepo;
import com.twitter.repository.UserRepo;
import com.twitter.requestDTO.UserStoryReqDTO;
import com.twitter.responseDTO.StoriesResponseDTO;
import com.twitter.utils.StoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StoryDaoImpl implements StoryDao {

    @Autowired
    private StoryRepo storyRepo;
    @Override
    public void addStory(Story story) {


        storyRepo.saveAndFlush(story);
    }

    @Override
    public List<StoriesResponseDTO> findStoryById(Long id) {
       List<Story> story= storyRepo.findByUserId(id);
       List<StoriesResponseDTO> storiesResponseDTO = StoryUtils.convertEntityToDTO(story);
        return storiesResponseDTO;
    }
}
