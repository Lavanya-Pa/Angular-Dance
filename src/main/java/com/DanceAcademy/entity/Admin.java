package com.DanceAcademy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "admins")
public class Admin {
	@Id
	@Column(length = 20)
	private String userName;
	@Column(length = 20)
	private String password;
	@Column(length = 10)
	private String type;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	public Admin(String userName, String password, String type) {
		super();
		this.userName = userName;
		this.password = password;
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	

	

}
