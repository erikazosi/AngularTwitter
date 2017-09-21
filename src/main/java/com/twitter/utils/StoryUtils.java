package com.twitter.utils;

import com.twitter.dto.StoryDTO;
import com.twitter.entity.Story;
import com.twitter.entity.User;
import com.twitter.requestDTO.UserStoryReqDTO;
import com.twitter.responseDTO.StoriesResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class StoryUtils {
    public static Story convertDTOToEntity(UserStoryReqDTO userStoryReqDTO) {

        Story story = new Story();
       // story.setStoryId(userStoryReqDTO.getStoryId());
        story.setStory(userStoryReqDTO.getStory());
        //story.setStoryCreatedDate(userStoryReqDTO.setCreatedDate);
        story.setUserId(userStoryReqDTO.getUserId());
        return story;

    }

    public static List<StoriesResponseDTO> convertEntityToDTO(List<Story> story) {


        List<StoriesResponseDTO> storiesResponseDTOS = new ArrayList<>();

        for(Story li:story) {
            StoriesResponseDTO storiesResponseDTO = new StoriesResponseDTO();
            storiesResponseDTO.setStory(li.getStory());
            storiesResponseDTOS.add(storiesResponseDTO);
        }
        return storiesResponseDTOS;
    }
}
