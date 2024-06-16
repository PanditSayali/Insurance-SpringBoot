package com.example.Insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsuranceWebsiteApplication {

	public static void main(String[] args) {
		
		System.setProperty("server.port","9191");
		SpringApplication.run(InsuranceWebsiteApplication.class, args);
	}

}
