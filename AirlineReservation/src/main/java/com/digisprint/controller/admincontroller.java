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
	
	
	@GetMapping("/admin")
	public String Entry() {
		return "admin";
	}
		
	@PostMapping("/adminlogin")

	 public ModelAndView loginadmin(HttpServletRequest request) throws SQLException {
	    System.out.println("comming");
	    String redirect;   
	    boolean result=service.validate(request);
	    if(result==true)
	    {
	        redirect="fetchflightdetails";
	    }
	    else {
	        redirect="index";
	    }
	    ModelAndView mv= new ModelAndView(redirect);
	    return mv;
	}
	
}
	


