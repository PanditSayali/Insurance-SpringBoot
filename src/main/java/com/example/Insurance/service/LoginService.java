package com.example.Insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Insurance.Model.LoginModel;
import com.example.Insurance.Repository.LoginRepository;
@Service
public class LoginService {

	
	@Autowired
	private LoginRepository loginRepository;

	public void addEmp(LoginModel emp) {
		loginRepository.save(emp);
	}

	public List<LoginModel> getAllEmp() {

		return loginRepository.findAll();

	}

	public LoginModel getEmpById(long id) {

		Optional<LoginModel> optional = loginRepository.findById(id);
		return optional.orElse(null);
	}

	public LoginModel deleteEmp(long id) {

		LoginModel emp = getEmpById(id);

		if (emp != null) {

			loginRepository.deleteById(id);
		}
		return emp;
	}

	public LoginModel updateEmp(@RequestBody LoginModel emp) {
		
		return loginRepository.save(emp);
	}

	public String loginEmp(String email, String password) {
		
		LoginModel employee = findStudentByEmail(email);
        System.out.println("Database Password"+employee.getPassword());
        System.out.println("Request Password"+password);
		if(employee.getEmail().equals(email)&& employee.getPassword().equals(password))
		{
			return "Record is present";
		}
		return null;
	}

	public LoginModel findStudentByEmail(String email) {

		  return loginRepository.findStudentByEmail(email);
	}

	public LoginModel findEmpByPassword(String password) {
		return loginRepository.findEmpByPassword(password);
	}
}
