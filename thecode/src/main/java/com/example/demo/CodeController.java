package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import org.springframework.ui.Model;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {
	return "index.jsp";
	}
	@RequestMapping(value = "/answer", method=RequestMethod.POST)
	public String answered(@RequestParam(value="player") String player) {
		System.out.println(player);
		String uplayer = player.toLowerCase();
		uplayer.toString();
		System.out.println(uplayer);
		if(uplayer == "messi") {
			System.out.println("inside else if");
			return "redirect:/right";
		}
		else if(uplayer == "cristiano ronaldo" || uplayer == "ronaldo" || uplayer == "cr7" || uplayer == "cristiano") {
			System.out.println("Inside if");
			return "redirect:/realwrong";
		}
		else {
			return "redirect:/wrong";
		}
	}
	
	@RequestMapping("/wrong")
	public String flashMessage(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "Try Again!" );
		return "redirect:/"; 
	}
	@RequestMapping("/right")
	public String righton() {
		return"right.jsp";
	}
	@RequestMapping("/realwrong")
	public String wrong() {
		return"realwrong.jsp";
	}
}
