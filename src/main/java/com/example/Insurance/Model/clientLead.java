package com.example.Insurance.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class clientLead {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String customerName;
	private String email;
	private long contactno;
	private int age;
	private String location;
	private String insurance;

	public clientLead() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
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

	@Override
	public String toString() {
		return "clientLead [id=" + id + ", customerName=" + customerName + ", email=" + email + ", contactno="
				+ contactno + ", age=" + age + ", location=" + location + ", insurance=" + insurance + "]";
	}

	
	
//	@Override
//	public String toString() {
//		return "ClientLead [id=" + id + ", customerName=" + customerName + ", contactno=" + contactno + ", age=" + age
//				+ ", location=" + location + ", contactthrough=" + contactthrough + "]";
//	}
}
