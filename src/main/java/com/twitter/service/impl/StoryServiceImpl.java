package com.twitter.service.impl;

import com.twitter.dao.StoryDao;
import com.twitter.dao.impl.StoryDaoImpl;
import com.twitter.dto.StoryDTO;
import com.twitter.dto.UserDTO;
import com.twitter.entity.Story;
import com.twitter.entity.User;
import com.twitter.requestDTO.UserStoryReqDTO;
import com.twitter.responseDTO.StoriesResponseDTO;
import com.twitter.service.StoryService;
import com.twitter.utils.StoryUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StoryServiceImpl implements StoryService {
    private StoryDao storyDao;

    public StoryServiceImpl(StoryDao storyDao) {
        this.storyDao = storyDao;
    }

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
    public void addStory(UserStoryReqDTO userStoryReqDTO)
    {
        Story story = StoryUtils.convertDTOToEntity(userStoryReqDTO);

      storyDao.addStory(story);
    }

    @Override
    public List<StoriesResponseDTO> findStoryById(long id) {
        List<StoriesResponseDTO> storiesResponseDTO = storyDao.findStoryById(id);
        return storiesResponseDTO;

    }
}
