package com.DanceAcademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DanceAcademy.entity.Booking;
import com.DanceAcademy.repo.BookingRepo;
import com.DanceAcademy.repo.ChoreographersRepo;
@Service
@Transactional
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private BookingRepo bookingRepo;

	@Override
	public void saveBookings(Booking book) {
		bookingRepo.save(book);
		}

	@Override
	public List<Booking> getUserBookings(String userName) {
		return bookingRepo.getUserBookings(userName);
	}

	@Override
	public void deleteBookings(int isbn) {
		bookingRepo.deleteById(isbn);
		
	}

	@Override
	public List<Booking> getAllBookings() {
		return bookingRepo.findAll();
	}

	@Override
	public void updateBookingStatus(String status, int bookingId) {
		bookingRepo.updateBookingStatus(status, bookingId);
		
	}

}
