package com.twitter.repository;

import com.twitter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    // @Query("SELECT u FROM User u where u.username= :username")
    User findByUsername(String username);

    @Query(" select u from User u where u.id not in (select f.followingId from Follow f where f.followerId= :id) and u.id!=:id")
            List<User> findAllWithoutCurrentUser(@Param("id")Long id);


    @Query("SELECT u FROM User u WHERE u.id IN (SELECT f.followingId FROM Follow f WHERE f.followerId= :id) AND u.id!=:id")
    List<User> findAllFollowingUsers(@Param("id")Long id);


    @Query("SELECT u FROM User u WHERE u.id IN (SELECT f.followerId FROM Follow f WHERE f.followingId= :id) AND u.id!=:id")
    List<User> findAllFollowers(@Param("id")Long id);

    @Query("DELETE f FROM Follow f WHERE f.followingId=:followingId AND f.followerId=:followerId")
    void unfollowUser(@Param("followerId")long followerId, @Param("followingId")long followingId);
}
