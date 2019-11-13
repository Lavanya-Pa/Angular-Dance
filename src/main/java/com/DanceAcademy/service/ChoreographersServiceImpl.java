package com.DanceAcademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DanceAcademy.entity.Choreographers;
import com.DanceAcademy.repo.ChoreographersRepo;

@Service
public class ChoreographersServiceImpl implements ChoreographersService{
	@Autowired
	private ChoreographersRepo choreoRepo;

	@Override
	public void addChoreos(Choreographers choreo) {
	 choreoRepo.save(choreo);
	 
	}

	@Override
	public void editChoreos(Choreographers choreo) {
//	 Choreographers c = new Choreographers();
//	 c.setId(choreo.getId());
//	 c.setName(choreo.getName());
//	 c.setAge(choreo.getAge());
//	 c.setLocation(choreo.getLocation());
//	 c.setDanceforms(choreo.getDanceforms());
//	 c.setSession(choreo.getSession());
//	 c.setPricetable(choreo.getPricetable());
	 choreoRepo.save(choreo);
	 
	}

	@Override
	public void deleteChoreos(int isbn) {
	 choreoRepo.deleteById(isbn);
	 
	}

	@Override
	public List<Choreographers> getAllChoreos() {
	 List<Choreographers> choreos = choreoRepo.findAll();
	 return choreos;
	}

	@Override
	public List<Choreographers> getLocation(String location) {
		return choreoRepo.getLocation(location);
	}
	
	
}
