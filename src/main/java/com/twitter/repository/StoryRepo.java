package com.twitter.repository;

import com.twitter.entity.Story;
import com.twitter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepo extends JpaRepository<Story, Long> {


}
