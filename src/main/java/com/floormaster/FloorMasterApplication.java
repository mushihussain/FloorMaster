package com.floormaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FloorMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(FloorMasterApplication.class, args);
		System.out.println("Hello Floor Master");
	}

}
