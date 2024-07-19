package com.hibernatemappingonetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Documents {
	@Id
	private int id;
	private String type;
	private String number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	

}
