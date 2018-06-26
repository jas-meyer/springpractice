package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	@RequestMapping("/")

	public String first(){
		return "This is the root page of the second project application";
	}

	@RequestMapping("/random")

	public String rando(){
		return "Spring Boot is the greatest framework!";
	}

}
