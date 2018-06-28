package com.example.demo;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class CountController {
	
	@RequestMapping("")
	public String home(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer count = (Integer) session.getAttribute("count");
			count += 1;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String countpage(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer count = (Integer) session.getAttribute("count");
		model.addAttribute("thecount",count);
		return "counter.jsp";
	}
	
	@RequestMapping("/double")
	public String twice(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer count = (Integer) session.getAttribute("count");
			count += 2;
			session.setAttribute("count", count);
		}
		return "double.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		count = 0;
		session.setAttribute("count", count);
	return "redirect:/counter";
	}
}