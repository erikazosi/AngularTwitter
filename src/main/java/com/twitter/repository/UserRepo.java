package com.twitter.repository;

import com.twitter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

   // @Query("SELECT u FROM User u where u.username= :username")
    User findByUsername( String username);

}
