package com.digisprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.model.Flight;
import com.digisprint.model.Passanger;
import com.digisprint.repository.*;
import com.digisprint.service.FlightService;
import com.digisprint.service.LoginService;
import com.digisprint.service.PassangerService;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

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

	Passanger passanger;
	
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
	 public ModelAndView login(HttpServletRequest request, ModelMap model) throws SQLException {
		    System.out.println("comming into filter");
		      
		    boolean result=loginService.validate(request);
		    if(result==true)
		    {
		    	passanger=	loginService.getdata(request.getParameter("firstname"));
		      return controller.fetchRowslogin(request);
		      
		    }
		    else {
		    	System.out.println("falseeee");
		        return controller.Loginfailed();
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

	@GetMapping("/userprofile")
	public String profile(ModelMap map) {
		System.out.println("Hello i am in userprofile");
		map.put("user", passanger);
		return "userprofile";
	}
	
	@GetMapping("/fetchpassangerdetails")
	public ModelAndView FetchAllPassanger ( HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("getallpassanger");
		List <Passanger> customer=(List<Passanger>) passangerrepository.findAll();
		request.setAttribute ("list", customer);
			
		return mv;
	}
}
	


