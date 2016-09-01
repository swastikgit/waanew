package com.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String login() {
		System.out.println("inside login");
 		return "login";
	}
 
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public String logout(Model model) {
 		return "login";
 	}
	
	@RequestMapping(value="/deniedPage")
	public String deniedPage(Model model) {
 		return "denied";
 	}
}
