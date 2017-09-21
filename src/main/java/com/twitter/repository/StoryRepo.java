package com.twitter.repository;

import com.twitter.entity.Story;
import com.twitter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepo extends JpaRepository<Story, Long> {

    @Query("SELECT s from Story s where s.userId= :userId")
    List<Story> findByUserId(@Param("userId") Long userId);
}
