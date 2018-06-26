package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DojoController {
	// Display text that says 'this dojo is awesome, when 
	//url is /dojo
	@RequestMapping("/")
	// Display text Burbank Dojo is located in Southern 
	//California when url is /burbank-dojo/
	
	// Display text SJ dojo is the headquarters 
	//when url is /san-jose/
	
}
