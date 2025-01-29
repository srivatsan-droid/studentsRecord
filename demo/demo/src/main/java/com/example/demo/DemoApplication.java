package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
/*
Creating a simple rest API Involves Creating an RestController as annonation
While Creating some Function we need to Give the GetMapping Method which will be Storing the request type to GET
 */
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
}
