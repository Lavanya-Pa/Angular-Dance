package com.DanceAcademy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DanceAcademy.entity.Admin;
import com.DanceAcademy.entity.User;
import com.DanceAcademy.repo.AdminRepo;
import com.DanceAcademy.repo.UserRepo;

@Service
@Transactional
public class DanceAcademyServiceImpl implements DanceAcademyService {

	@Autowired
	private UserRepo repo;

	@Autowired
	private AdminRepo adminRepo;

	@Override
	public Boolean registerUser(User user) {
//		User u=new User();
		user.setType("user");
		repo.save(user);
		return true;
	}

		

	@Override
	public List<String> validateLoginType(String userName) {
		boolean adminFromDb = adminRepo.existsById(userName);
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		if (adminFromDb) {

			list1.add("admin");
			return list1;
		} else {
			list2.add("user");
			return list2;
		}

	}

	@Override
	public boolean validateUserLogin(String userName, String password) {
		User user = repo.validateUserLogin(userName);
		Admin admin = adminRepo.validateAdminLogin(userName);
		
		if (user != null) {
			String pwd = user.getPassword();
			if (pwd.equals(password))
				return true;
			else
				return false;
		} 
		
		else if (admin != null) {
			String pwd = admin.getPassword();
			if (pwd.equals(password))
				return true;
			else
				return false;
		} else
			return false;

	}

	@Override
	public boolean validateAdminLogin(String userName, String password) {
		Admin admin = adminRepo.validateAdminLogin(userName);
		
		if (admin != null) {
			String pwd = admin.getPassword();
			if (pwd.equals(password))
				return true;
			else
				return false;
		} else
			return false;
	}

}
