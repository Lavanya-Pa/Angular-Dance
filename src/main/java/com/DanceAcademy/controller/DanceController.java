package com.DanceAcademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DanceAcademy.entity.User;
import com.DanceAcademy.service.DanceAcademyService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DanceController {

	@Autowired
	private DanceAcademyService service;

	@GetMapping("/hello")
	public void hello() {
		System.out.println("hello");
	}

	@PostMapping("/registerUser")
	public void registerUser(@RequestBody User user) {
		service.registerUser(user);
	}

	@GetMapping("/validateLoginType/{userName}")
	public List<String> validateLoginType(@PathVariable String userName){
		System.out.println("werty");
		List<String> type=service.validateLoginType(userName);
		return type;
	}
	
	@GetMapping("/validateUserLogin/{userName}/{password}")
	public boolean validateUser(@PathVariable("userName") String userName, @PathVariable("password") String password) {
		System.out.println(userName + "   yeee     " + password);
		boolean valid = service.validateUserLogin(userName, password);
		System.out.println(valid);
		return valid;
	}
	
	@GetMapping("/validateAdminLogin/{userName}/{password}")
	public boolean validateAdmin(@PathVariable("userName") String userName, @PathVariable("password") String password) {
		System.out.println(userName + "   yeee     " + password);
		boolean valid = service.validateAdminLogin(userName, password);
		System.out.println(valid);
		return valid;
	}

}
