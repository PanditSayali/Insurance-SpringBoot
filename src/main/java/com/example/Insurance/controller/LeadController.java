package com.example.Insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.Insurance.Model.clientLead;
import com.example.Insurance.service.LeadService;

@RestController
@CrossOrigin("*")
@RequestMapping("/leads")
public final class LeadController {
	@Autowired
	private LeadService leadService;

	@PostMapping(path ="/leadadd")
	public String addLead(@RequestBody clientLead clientleads) {
		leadService.addLead(clientleads);
		return "Lead Enter Sucessfully";
	}

	@GetMapping(path="/getAlllead")
	public List<clientLead> getAllLead() {
		
		List<clientLead> clientleads=leadService.getAllLead();
		return clientleads;
	}
	
	@GetMapping(path="/getleadById")
	public clientLead GetLeadById(@RequestParam long id) {
		
		clientLead clientleads = leadService.GetLeadById(id);
		return clientleads;
	}
	
	@GetMapping(path = "/getbyinsurance")
	public List<clientLead> findByInsurance(@RequestParam String insurance) {
		 List<clientLead> clientleads = leadService.findByInsurance(insurance);
		return clientleads;
	}
	@PostMapping("/health-leads")
    public ResponseEntity<String> addHealthLead(@RequestBody clientLead clientleads) {
        // Save lead to health table
        return ResponseEntity.ok("Health lead added successfully");
    }

    @PostMapping("/life-leads")
    public ResponseEntity<String> addLifeLead(@RequestBody clientLead clientleads) {
        // Save lead to life table
        return ResponseEntity.ok("Life lead added successfully");
    }

    @PostMapping("/general-leads")
    public ResponseEntity<String> addGeneralLead(@RequestBody clientLead clientleads) {
        // Save lead to general table
        return ResponseEntity.ok("General lead added successfully");
    }
}

