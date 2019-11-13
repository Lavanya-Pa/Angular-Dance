package com.DanceAcademy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.DanceAcademy.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
	@Query("SELECT booking FROM Booking booking WHERE booking.userName=(:uName)")
	List<Booking> getUserBookings(@Param("uName") String uName);

}
