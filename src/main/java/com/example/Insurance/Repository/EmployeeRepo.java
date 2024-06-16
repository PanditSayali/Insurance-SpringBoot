//package com.example.Insurance.Repository;
//
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.stereotype.Repository;
//
//import com.example.Insurance.Model.Employee;
//
//import DTO.EmployeeDTO;
//
//@EnableJpaRepositories
//@Repository
//public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
//
//	 Optional<Employee> findOneByEmailAndPassword(String email, String password);
//	Employee findByEmail(String email);
//	Employee save(EmployeeDTO employeeDTO);
//	
//	 
//}
