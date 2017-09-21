package com.twitter.repository;

import com.twitter.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FollowRepo extends JpaRepository<Follow, Long> {
}
