package com.example.Insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.Insurance.Model.ContactUS;
import com.example.Insurance.Model.clientLead;
import com.example.Insurance.service.ContactUSService;
import com.example.Insurance.service.LeadService;


@CrossOrigin("*")
@RestController
@RequestMapping("/Insurance")
public class ContactUSController {

	
	@Autowired
	private  ContactUSService contactService;
//	@Autowired
//	private LeadService leadService;
//
//	@PostMapping(path ="/leadadd")
//	public String addLead(@RequestBody clientLead clientleads) {
//		leadService.addLead(clientleads);
//		return "Lead Enter Sucessfully";
//	}
//
//	@GetMapping(path="/getAlllead")
//	public List<clientLead> getAllLead() {
//		
//		List<clientLead> clientleads=leadService.getAllLead();
//		return clientleads;
//	}
//	
//	@GetMapping(path="/getleadById")
//	public clientLead GetLeadById(@RequestParam long id) {
//		
//		clientLead clientleads = leadService.GetLeadById(id);
//		return clientleads;
//	}
	@PostMapping("/contactsadd")
	public String addContact(@RequestBody ContactUS contact) {
		contactService.addContact(contact);
		return "Contact Added Sucessfully";
	}
	
	@GetMapping("/AllContact")
	public List<ContactUS> getAllContact(){
		List<ContactUS> Contact = contactService.getAllContact();
		return Contact;
		
	}
}
