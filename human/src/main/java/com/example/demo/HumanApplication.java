package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class HumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanApplication.class, args);
	}
 	 @RequestMapping("/{firstname}/{lastname}")

 	 public String index(@RequestParam(value = "firstname", required = false) String firstname, 
 	 	@RequestParam(value = "lastname", required = false) String lastname){
 	 	return "Hello " + firstname + lastname + "!";
 	 }
// 	public String index(@RequestParam(value="name", required = false) String name) {
// 		if(name == null || name == "") {
// 			return "Hello Human!";
// 		}
// 		else {
// 		return "Hello "+ name +"!";
// 	}
// }
}
