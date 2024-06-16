package com.example.Insurance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Insurance.Model.LoginModel;
@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Long> {

	
	LoginModel findStudentByEmail(String email);

	LoginModel findEmpByPassword(String password);
}
