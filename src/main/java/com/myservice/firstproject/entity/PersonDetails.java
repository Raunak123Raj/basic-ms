package com.myservice.firstproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonDetails {

	
	
	@Id
	private String id;
	
	private String personName;
	private String city;
	private String mobNumber;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
	
	
	
}
