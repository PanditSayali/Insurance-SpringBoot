package com.example.Insurance.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ContactUS {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String contactname;
	private String contactemail;
	private String contactsubject;
	private String contactmsg;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getContactemail() {
		return contactemail;
	}
	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}
	public String getContactsubject() {
		return contactsubject;
	}
	public void setContactsubject(String contactsubject) {
		this.contactsubject = contactsubject;
	}
	public String getContactmsg() {
		return contactmsg;
	}
	public void setContactmsg(String contactmsg) {
		this.contactmsg = contactmsg;
	}
	
	public ContactUS() {
		
	}
	@Override
	public String toString() {
		return "ContactUS [id=" + id + ", contactname=" + contactname + ", contactemail=" + contactemail
				+ ", contactsubject=" + contactsubject + ", contactmsg=" + contactmsg + "]";
	}
	
	
	
	
}
