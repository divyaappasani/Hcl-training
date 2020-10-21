package org.hcl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contactus")
public class ContactController {
	@GetMapping("/")
	public String showContacts() {
		return "contactus";
	}

}
