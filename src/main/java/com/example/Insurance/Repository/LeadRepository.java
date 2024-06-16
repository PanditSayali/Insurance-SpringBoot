package com.example.Insurance.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Insurance.Model.clientLead;

@Repository
public interface LeadRepository extends JpaRepository<clientLead, Long> {

	 List<clientLead> findByInsurance(String insurance);


}
