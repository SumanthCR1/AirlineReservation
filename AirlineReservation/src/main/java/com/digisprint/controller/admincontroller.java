package com.digisprint.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.model.Flight;
import com.digisprint.repository.adminrepository;
import com.digisprint.service.FlightService;
import com.digisprint.service.adminService;

import javax.servlet.*;
import javax.servlet.http.*;

@Controller
@Component
public class admincontroller {

	@Autowired
	adminService adminservice;

	@Autowired
	FlightService flightservice;

	@Autowired
	FlightController controller;
	
	@GetMapping("/admin")
	public String Entry() {
		return "admin";
	}

	@PostMapping("/adminlogin")

	public ModelAndView loginadmin(@RequestParam("username") String username,
			@RequestParam("adminpassword") String adminpassword, HttpServletRequest request) throws SQLException {
		System.out.println(username + " " + adminpassword);
		String redirect;
		boolean result = adminservice.validate(username, adminpassword);
		if (result == true) {
			System.out.println("True comming");
			return controller.fetchflightdetailsfromadmin(request);
		} else {
			return null;
		}
	}

	@RequestMapping(value = "/deleteflight/{flightnumber}", method = RequestMethod.GET)
	public String delete(@PathVariable int flightnumber) {

		adminservice.DeleteFlight(flightnumber);

		return "flightdeletedsuccessful";

	}

	@RequestMapping(value="/addFlight" , method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("flightForm") Flight flight) {
		adminservice.addBook(flight);
		return new ModelAndView("redirect:/fetchflightdetailsfromadmin"); // data will add and return to main page
	}

	
	@RequestMapping("/editFlight123/{flightnumber}")
	public ModelAndView editFlight(@PathVariable("flightnumber") int flightnumber) {
		ModelAndView modelAndView = new ModelAndView();
		Flight flight = adminservice.UpdateFlight(flightnumber);
		
			
		modelAndView.addObject("flightForm",flight);
		modelAndView.setViewName("addflight");
		return modelAndView;
	}
	
	@RequestMapping(value="/addFlight" , method=RequestMethod.GET)
	public ModelAndView addFlight() {
		ModelAndView modelAndView = new ModelAndView();
		Flight flight = new Flight();
		modelAndView.addObject("flightForm",flight);
		modelAndView.setViewName("addflight");
		return modelAndView;
	}
	 

}
