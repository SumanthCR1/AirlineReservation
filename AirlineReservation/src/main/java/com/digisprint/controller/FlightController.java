package com.digisprint.controller;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.repository.Flightrepository;
import com.digisprint.service.FlightService;

@Controller
@Component

public class FlightController {
	
	@Autowired
	Flightrepository flightrepository;
	
	@Autowired
	FlightService flightservice;
	
	@GetMapping("/fetchflightdetails")
	public ModelAndView fetchRows ( HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("getflight");
		List <Flight> ft=flightservice.flightlist();
		request.setAttribute ("result", ft);
		
		return mv;
	}
	
	
	@GetMapping("/fetchflightdetailslogin")
	public ModelAndView fetchRowslogin ( HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("Loginsuccess");
		List <Flight> ft=flightservice.flightlist();
		request.setAttribute ("resultlogin", ft);
		request.setAttribute("flight1", ft.get(1));
		return mv;
	}
	
	
	@GetMapping("failed")
	public ModelAndView Loginfailed() {
		ModelAndView mv= new ModelAndView("Loginfailed");
		return mv;
	}			
		
	@GetMapping("/fetchflightdetailsfromadmin")
	public ModelAndView fetchflightdetailsfromadmin ( HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("fetchflightbyadmin");
		List <Flight> ft=flightservice.flightlist();
		request.setAttribute ("fromadmin", ft);
		System.out.println("Abcd");
		return mv;
	}
	@RequestMapping(value = "/deleteflight",method = RequestMethod.GET)
	public ModelAndView delet(@PathVariable("id") int id) {
		ModelAndView model=new ModelAndView();
		System.out.println(id);
		flightservice.delectflight(id);
		List<Flight> list=flightservice.flightlist();
		model.addObject("flightlist",list);
		//model.setViewName("wardenlist");
		//return new ModelAndView("wardenlist");
      return model;
}
	
  
}
