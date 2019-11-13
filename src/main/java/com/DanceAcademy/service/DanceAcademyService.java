package com.DanceAcademy.service;

import java.util.List;

import com.DanceAcademy.entity.User;

public interface DanceAcademyService {

	Boolean registerUser(User user);

	List<String> validateLoginType(String userName);
	
	boolean validateUserLogin(String userName, String password);
	
	boolean validateAdminLogin(String userName, String password);
	
	

}
