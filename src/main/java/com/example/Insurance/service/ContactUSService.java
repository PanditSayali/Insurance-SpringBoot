package com.example.Insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Insurance.Model.ContactUS;
import com.example.Insurance.Repository.ContactUSRepository;
@Service
public class ContactUSService {

	@Autowired
	private ContactUSRepository contactRepo;
	
	public void addContact(ContactUS contact) {
		
		contactRepo.save(contact);
		
	}
	public List<ContactUS> getAllContact() {
		
		return contactRepo.findAll();
		
	}
}
