package com.DanceAcademy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.DanceAcademy.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, String> {
	@Query("SELECT admins FROM Admin admins WHERE admins.userName=(:uName)")
    Admin validateAdminLogin(@Param("uName") String uName);

}
