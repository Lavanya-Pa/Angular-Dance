package com.DanceAcademy.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.DanceAcademy.entity.Booking;
import com.DanceAcademy.entity.Choreographers;

public interface BookingService {
	void saveBookings(Booking book);
	List<Booking> getUserBookings(String userName);
	void deleteBookings(int isbn);
	
	List<Booking> getAllBookings();
	
	public void updateBookingStatus(String status,int bookingId);

}
