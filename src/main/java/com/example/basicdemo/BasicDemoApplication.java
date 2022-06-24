package com.example.basicdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicDemoApplication.class, args);
		System.out.println("Dummy application for Jenkins trial - pipeline creation");
	}

}
