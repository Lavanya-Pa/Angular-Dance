package com.DanceAcademy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.DanceAcademy.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	@Query("SELECT user FROM User user WHERE user.userName=(:uName)")
    User validateUserLogin(@Param("uName") String uName);

}
