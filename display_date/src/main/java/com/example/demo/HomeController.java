package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	@RequestMapping("")
	public String home() {
	return "index.jsp";
}
	@RequestMapping("/date")
	public String datepage(Model model) {
		Date now = new Date();
		SimpleDateFormat dayformatter = new SimpleDateFormat("EEEE, 'the' d 'of' MMMM',' yyyy  ");
		String day = dayformatter.format(now);
		model.addAttribute("todays", day);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String timepage(Model model) {
		Date now = new Date();
		SimpleDateFormat timeformatter = new SimpleDateFormat("hh:mm a");
		String time = timeformatter.format(now);
		model.addAttribute("rightnow", time);
		return "time.jsp";
	}
}
