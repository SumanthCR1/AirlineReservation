package com.digisprint.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.repository.Flightrepository;
import com.digisprint.repository.Passangerrepository;

@Controller
@Component
public class FlightController {
	@Autowired
	Flightrepository flightrepository;
	
	
	@GetMapping("/fetchflight")
	public ModelAndView fetchRows(HttpServletRequest request){
		  System.out.println("commingg");
		ModelAndView mv= new ModelAndView("getflight"); 
		List<Flight>   cust=  (List<Flight>) flightrepository.findAll(); 
		request.setAttribute("cust",cust);
	
		 return mv;	
		 
	}
}
