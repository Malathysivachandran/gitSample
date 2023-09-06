package com.example.git.demogit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemogitApplication {

	public void add(){

		System.out.println("**********");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemogitApplication.class, args);
	}

}
