package com.DanceAcademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DanceAcademy.entity.Choreographers;
import com.DanceAcademy.service.ChoreographersService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ChoreographersController {
	@Autowired
	private ChoreographersService choreoService;

	@PostMapping("/addChoreo")
	public void addChoreo(@RequestBody Choreographers choreo) {
	 choreoService.addChoreos(choreo);
	}

	@GetMapping("/getAllChoreos")
	public List<Choreographers> getAllChoreos() {
	 return choreoService.getAllChoreos();
	}

	@DeleteMapping("/deleteChoreo/{isbn}")
	public void deleteByIsbn(@PathVariable int isbn) {
	 choreoService.deleteChoreos(isbn);
	}

	@PutMapping("/updateChoreo")
	public void updateChoreo(@RequestBody Choreographers choreo) {
	 choreoService.editChoreos(choreo);
	}
	@GetMapping("/getlocation/{location}")
	public List<Choreographers> getLocation(@PathVariable("location") String location) {
	 return choreoService.getLocation(location);
	}




}
