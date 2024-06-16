package com.example.Insurance.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class LoginModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	private long mobile;
	private long adharno;
	private long pancardno;
	private String image;
	private String password;
	
	
	
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getMobile() {
		return mobile;
	}



	public void setMobile(long mobile) {
		this.mobile = mobile;
	}



	public long getAdharno() {
		return adharno;
	}



	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}



	public long getPancardno() {
		return pancardno;
	}



	public void setPancardno(long pancardno) {
		this.pancardno = pancardno;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", adharno="
				+ adharno + ", pancardno=" + pancardno + ", image=" + image + ", password=" + password
				+ ", getPassword()=" + getPassword() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getMobile()=" + getMobile() + ", getAdharno()=" + getAdharno()
				+ ", getPancardno()=" + getPancardno() + ", getImage()=" + getImage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
