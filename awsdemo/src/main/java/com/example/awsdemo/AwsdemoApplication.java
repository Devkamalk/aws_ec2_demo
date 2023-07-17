package com.example.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsdemoApplication.class, args);
	}
	
	@GetMapping("/")
	String helloWorld(){
		return "hello World from aws ec2";
		
	}

}
