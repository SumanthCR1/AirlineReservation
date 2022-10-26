package com.digisprint.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.digisprint.repository.Passangerrepository;
import com.digisprint.service.FlightService;
import com.digisprint.service.LoginService;
import com.digisprint.service.PassangerService;

@Controller
@Component

public class PassangerController {
	@Autowired
	Passangerrepository passangerrepository;

	@Autowired
	PassangerService passangerService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	FlightController controller;

	@Autowired
	FlightService flightservice;

	@GetMapping("/")
	public String Welcome() {
		return "Welcome";
	}
	
	@GetMapping("/index")
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
	
	 @PostMapping("/filter") 
	 public String login(HttpServletRequest request, ModelMap model) throws SQLException {
		    System.out.println("comming into filter");
		      
		    boolean result=loginService.validate(request);
		    if(result)
		    {
		    	return "Loginsuccess";
		      
		    }
		    else {
		        return "Loginfailed";
		    }

		}
			 
	 
	@PostMapping("/details")
	public String viewDetails(
			@RequestParam("firstname") String firstname,
			@RequestParam("lastname")String lastname,
			@RequestParam("age") int age,
			@RequestParam("gender") String gender,
			@RequestParam("phonenumber") String phonenumber,
			@RequestParam("contactaddress")String contactaddress,
			@RequestParam("emailid")String emailid,
			@RequestParam("password")String password,
			ModelMap modelMap)
	{
		
		return passangerService.details(firstname, lastname, age, gender, phonenumber, contactaddress, emailid, password, modelMap);
	}

}
	


