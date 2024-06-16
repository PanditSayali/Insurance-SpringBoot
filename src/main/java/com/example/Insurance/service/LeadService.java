package com.example.Insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Insurance.Model.clientLead;
import com.example.Insurance.Repository.LeadRepository;

@Service
public class LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	public void addLead(clientLead clientleads) {
		leadRepo.save(clientleads);
	}
	
	public List<clientLead>getAllLead()
	{
		return leadRepo.findAll();
	}
	
	public clientLead GetLeadById(long id) {
	 
		Optional<clientLead> optional =leadRepo.findById(id);
		return optional.orElse(null);
	}

	public  List<clientLead> findByInsurance(String insurance) {
		return leadRepo.findByInsurance(insurance);
		
	}

//	public clientLead GetLeadByInsurance(String insurance) {
//		Optional<clientLead> optional =leadRepo.findByInsurance();
//		return optional.orElse(null);
//	}
}
