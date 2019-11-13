package com.DanceAcademy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "choreographers")
public class Choreographers {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "isbn_generator")
@SequenceGenerator(name = "isbn_generator", sequenceName = "isbn_seq", allocationSize = 1000)
private int id;
@Column(length = 50)
private String name;
@Column(length = 10)
private int age;
@Column(length = 50)
private String location;
@Column(length = 50)
private String danceforms;
@Column(length = 50)
private String session;
@Column(length = 10)
private int pricetable;


public Choreographers() {
	
}
public Choreographers(String name, int age, String location, String danceforms, String session, int pricetable) {
	super();
	this.name = name;
	this.age = age;
	this.location = location;
	this.danceforms = danceforms;
	this.session = session;
	this.pricetable = pricetable;
}
@Override
public String toString() {
	return "Choreographers [name=" + name + ", age=" + age + ", location=" + location + ", danceforms=" + danceforms
			+ ", session=" + session + ", pricetable=" + pricetable + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
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