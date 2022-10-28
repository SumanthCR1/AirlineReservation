package com.digisprint.controller;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.model.Flight;
import com.digisprint.repository.adminrepository;
import com.digisprint.service.adminService;

import javax.servlet.*;
import javax.servlet.http.*;

@Controller
@Component

public class admincontroller {
	@Autowired
	adminrepository admin;
	
	@Autowired
	adminService service;
	
	@Autowired
	FlightController controller;
	
	
	@GetMapping("/admin")
	public String Entry() {
		return "admin";
	}
		
	@PostMapping("/adminlogin")

	 public ModelAndView loginadmin(@RequestParam ("username") String username, @RequestParam("adminpassword") String adminpassword,  HttpServletRequest request) throws SQLException {
	    System.out.println(username +" "+adminpassword);
	    String redirect;   
	    boolean result=service.validate(username, adminpassword);
	    if(result==true)
	    {
	    	System.out.println("True comming");
	        return controller.fetchflightdetailsfromadmin(request);
	    }
	    else {
	        return null ;
	    }
	   // ModelAndView mv= new ModelAndView(redirect);
	    //return mv;
	}
	
}
	


