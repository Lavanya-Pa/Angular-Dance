package com.DanceAcademy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 20)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column(length = 20)
	private String userName;
	@Column(length = 20)
	private String contact;
	@Column(length = 20)
	private String email;
	@Column(length = 20)
	private String password;
	@Column(length = 20)
	private String type;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String firstName, String lastName, String userName, String contact, String email,
			String password, String type) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.contact = contact;
		this.email = email;
		this.password = password;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", contact=" + contact + ", email=" + email + ", password=" + password + ", type=" + type + "]";
	}

	
	


}
