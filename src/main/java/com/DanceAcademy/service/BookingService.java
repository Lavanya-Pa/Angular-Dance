package com.DanceAcademy.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.DanceAcademy.entity.Booking;

public interface BookingService {
	void saveBookings(Booking book);
	List<Booking> getUserBookings(String userName);
	void deleteBookings(int isbn);

}
