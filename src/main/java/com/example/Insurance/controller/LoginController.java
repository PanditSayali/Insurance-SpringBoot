package com.example.Insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Insurance.Model.LoginModel;
import com.example.Insurance.service.LoginService;
@RestController
@CrossOrigin("*")
@RequestMapping("/Insurance")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@PostMapping(path = "/addemp")
	public String addEmp(@RequestBody LoginModel emp) {
		loginService.addEmp(emp);
		return "Employee Added";
	}

	@GetMapping(path = "/getAllEmp")
	public List<LoginModel> getAllEmp() {

		List<LoginModel> emp = loginService.getAllEmp();
		return emp;
	}

	@GetMapping(path = "/getById")
	public LoginModel getEmpById(@RequestParam long id) {

		LoginModel emp = loginService.getEmpById(id);
		return emp;
	}

	@DeleteMapping(path = "/deleteEmp")
	public String deleteEmp(@RequestParam long id) {
		LoginModel emp = loginService.deleteEmp(id);
		if (emp != null) {

			return "Employee Deleted";
		}

		return "Employee Not Found";

	}

	@PutMapping(path = "/updateEmp")
	public String updateEmp(@RequestBody LoginModel emp) {
		LoginModel employee = loginService.updateEmp(emp);
		if (employee != null) {
			return "Employee Updated";
		} else {
			return "Employee Not Updated";
		}

	}
	
	@GetMapping(path = "/empemail")
	public LoginModel findStudentByEmail(@RequestParam String email) {

		LoginModel employee = loginService.findStudentByEmail(email);
		return employee;
	}
	
	@GetMapping(path = "/emppass")
	public String findEmpByPassword(@RequestParam String password) {

		LoginModel employee=loginService.findEmpByPassword(password);
		if(employee!=null) {
			return "Password Fetched";
		}
		return "Password Not Fetched";
	}
	
	@PostMapping(path = "/loginEmp")
	public String loginEmp(@RequestParam String email, @RequestParam String password) {
		
	     String employee= loginService.loginEmp(email,password);
	     if(employee!=null) {
		return employee;
	     }
	     else {
	    	 return "REcord is not present";
	     }
		
	}
	
	
	
}
