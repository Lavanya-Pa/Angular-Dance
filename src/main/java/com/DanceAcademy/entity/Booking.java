package com.DanceAcademy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "isbn_generator")
	@SequenceGenerator(name = "isbn_generator", sequenceName = "isbn_seq", allocationSize = 1000)
	private int bookingId;
	@Column(length = 50)
	private String userName;
	@Column(length = 50)
	private String location;
	@Column(length = 50)
	private String choreographers;
	@Column(length = 50)
	private String danceforms;
	@Column(length = 50)
	private String session;
	@Column(length = 10)
	private int pricetable;
	@Column(length = 50)
	private String status;
	
	
	
	public Booking() {
		
	}

	

	public Booking(int bookingId, String userName, String location, String choreographers, String danceforms,
			String session, int pricetable, String status) {
		super();
		this.bookingId = bookingId;
		this.userName = userName;
		this.location = location;
		this.choreographers = choreographers;
		this.danceforms = danceforms;
		this.session = session;
		this.pricetable = pricetable;
		this.status = status;
	}

	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userName=" + userName + ", location=" + location
				+ ", choreographers=" + choreographers + ", danceforms=" + danceforms + ", session=" + session
				+ ", pricetable=" + pricetable + "]";
	}


	
	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getChoreographers() {
		return choreographers;
	}
	public void setChoreographers(String choreographers) {
		this.choreographers = choreographers;
	}
	public String getDanceforms() {
		return danceforms;
	}
	public void setDanceforms(String danceforms) {
		this.danceforms = danceforms;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public int getPricetable() {
		return pricetable;
	}
	public void setPricetable(int pricetable) {
		this.pricetable = pricetable;
	}
	
	


}
