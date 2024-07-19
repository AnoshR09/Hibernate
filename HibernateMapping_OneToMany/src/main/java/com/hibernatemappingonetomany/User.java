package com.hibernatemappingonetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User {
	@Id
	private int userId;
	private String name;
	private String address;
	
	public List<Documents> getDocuments() {
		return Documents;
	}
	public void setDocuments(List<Documents> documents) {
		Documents = documents;
	}
	@OneToMany
	private List<Documents> Documents;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		

}
