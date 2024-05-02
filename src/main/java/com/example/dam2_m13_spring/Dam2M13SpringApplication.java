package com.example.dam2_m13_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class to start the application
 */
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "entity")
public class Dam2M13SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dam2M13SpringApplication.class, args);
	}

}
