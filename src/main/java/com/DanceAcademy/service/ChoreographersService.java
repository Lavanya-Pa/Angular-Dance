package com.DanceAcademy.service;

import java.util.List;

import com.DanceAcademy.entity.Choreographers;

public interface ChoreographersService {
	void addChoreos(Choreographers choreo);
	void editChoreos(Choreographers choreo);
	void deleteChoreos(int isbn);

	List<Choreographers> getAllChoreos();
	
	List<Choreographers> getLocation(String location);

}
