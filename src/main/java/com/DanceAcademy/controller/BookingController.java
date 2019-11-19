package com.DanceAcademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DanceAcademy.entity.Booking;
import com.DanceAcademy.entity.Choreographers;
import com.DanceAcademy.service.BookingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookingController {
	@Autowired
	private BookingService bookingservice;
	
	@PostMapping("/addBookings")
	public void saveBookings(@RequestBody Booking book) {
		bookingservice.saveBookings(book);
	}
	
	@GetMapping("/getUserBookings/{userName}")
	public List<Booking> getUserBookings(@PathVariable("userName") String userName) {
		return bookingservice.getUserBookings(userName);
	}
	@DeleteMapping("/deleteBookings/{isbn}")
	public void deleteByIsbn(@PathVariable int isbn) {
		bookingservice.deleteBookings(isbn);
	}
	@GetMapping("/getAllBookings")
	public List<Booking> getAllBookings() {
	return bookingservice.getAllBookings();
	}
	@GetMapping(value = "/updateBookingStatus/{status}/{bookingId}")
	public void updateBookingStatus(@PathVariable("status") String status, @PathVariable("bookingId") int bookingId) {
		bookingservice.updateBookingStatus(status, bookingId);
	}


}
