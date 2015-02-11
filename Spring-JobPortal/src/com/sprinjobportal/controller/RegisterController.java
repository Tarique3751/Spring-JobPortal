/**
 * 
 */
package com.sprinjobportal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sprinjobportal.model.RegistrationBO;

/**
 * @author Viresh
 *
 */
@Controller
public class RegisterController {

	@RequestMapping(value="/registerReq", method=RequestMethod.POST)
	public String registerRequest(Model model, HttpSession session){
		model.addAttribute("registration", new RegistrationBO());
		return "register";
	}
	
	@RequestMapping(value="/registerSubmit", method=RequestMethod.POST)
	public String registerSubmit(Model modal, HttpSession session, 
			@ModelAttribute(value="registration") RegistrationBO registrationBO){
		System.out.println(registrationBO.toString());
		return "home";
	}
}
