package com.digisprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.digisprint.repository.*;
import com.digisprint.service.PassangerService;

@Controller
@Component

public class PassangerController {
	@Autowired
	Passangerrepository passangerrepository;

	@Autowired
	PassangerService passangerService;
	
	@GetMapping("/input")
	public String Entry() {
		return "index";
	}

	@GetMapping("/regist")
	public String navigate() {
		return "register";
	}

	@GetMapping("/login")
	public String loginpage() {
		return "Login";
	}
	
	
	@GetMapping("/filter")
	public String filterpage() {
		return "filterflight";
	}
	
	@PostMapping("/details")
	public String viewDetails(
			@RequestParam("firstname") String firstname,
			@RequestParam("lastname")String lastname,
			@RequestParam("age") int age,
			@RequestParam("gender") String gender,
			@RequestParam("phonenumber") String phonenumber,
			@RequestParam("contactaddress")String contactaddress,
			@RequestParam("emailid")String emailid, ModelMap modelMap)
	{
		
		return passangerService.details(firstname, lastname, age, gender, phonenumber, contactaddress, emailid, modelMap);
	}

}
	


