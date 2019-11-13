package com.DanceAcademy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.DanceAcademy.entity.Choreographers;
import com.DanceAcademy.entity.User;

@Repository
public interface ChoreographersRepo extends JpaRepository<Choreographers, Integer>{
	@Query("SELECT choreographers FROM Choreographers choreographers WHERE choreographers.location=(:loc)")
	List<Choreographers> getLocation(@Param("loc") String loc);

}