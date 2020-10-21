package org.hcl1.controllers;

import java.util.Map;
import javax.validation.Valid;
import org.hcl1.entity.Person;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/persons")
public class PersonController {
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true); 
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	@GetMapping("/")
	public ModelAndView showPerson(){
		ModelAndView mv=new ModelAndView("persons");
		Map<String,Object> model=mv.getModel();
		Person p=new Person();
		model.put("p", p);
		return mv;
	}
	@PostMapping("/process")
	public String processForm(@ModelAttribute("p")@Valid Person p,BindingResult result) {
		if(result.hasErrors())
			return "persons";
		return "person-confirm";
		
	}
}
