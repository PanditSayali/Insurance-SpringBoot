//package com.example.Insurance.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.example.Insurance.Model.Employee;
//import com.example.Insurance.Repository.EmployeeRepo;
//import com.example.Insurance.service.EmployeeService;
//import DTO.EmployeeDTO;
//
//
//@Service
//public class EmployeeIMPL implements EmployeeService {
//
//	@Autowired
//	private EmployeeRepo employeeRepo;
//
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//
//	public Employee createEmp(EmployeeDTO employeeDTO) {
//		// TODO Auto-generated method stub
//		return employeeRepo.save(employeeDTO);
//	}
//
////	@Override
////	public void addEmployee(EmployeeDTO employeeDTO) {
////		// TODO Auto-generated method stub
////		
////		employeeRepo.saveAll(employeeDTO);
////		
//////		return null;
////	}
//
////	@Override
////	public String addEmployee(EmployeeDTO employeeDTO) 
////	{
////		Employee employee = new Employee(
////				employeeDTO.getEmployeeid(),
////                employeeDTO.getEmployeename(),
////                employeeDTO.getEmail(),
////                this.passwordEncoder.encode(employeeDTO.getPassword())
////		        );
////		        employeeRepo.save(employee);
////				return employee.getEmployeename();
////	}
//
//}
