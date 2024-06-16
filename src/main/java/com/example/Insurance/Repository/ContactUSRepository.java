package com.example.Insurance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Insurance.Model.ContactUS;

@Repository
public interface ContactUSRepository extends JpaRepository<ContactUS, Long>{

	

}
