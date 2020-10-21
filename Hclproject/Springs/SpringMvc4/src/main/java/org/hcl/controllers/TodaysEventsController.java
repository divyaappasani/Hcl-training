package org.hcl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todaysevent")
public class TodaysEventsController {
	@GetMapping("/show")
	public String showEvents(){
		return "todaysevent";
	}

}
