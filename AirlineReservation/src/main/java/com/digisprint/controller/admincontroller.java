package com.digisprint.controller;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.service.FlightService;
import com.digisprint.service.AdminService;
import javax.servlet.http.*;

@RestController
public class AdminController {

	AdminService adminService;
	FlightService flightService;
	FlightController flightController;

	public AdminController(AdminService adminService, FlightService flightService, FlightController flightController) {

		this.adminService = adminService;
		this.flightService = flightService;
		this.flightController = flightController;
	}

	@GetMapping("/admin")
	public ModelAndView adminLoginPage() {
		ModelAndView model = new ModelAndView("adminLoginPage");
		return model;
	}

	@PostMapping("/adminLogin")
	public ModelAndView loginAdminValidation(@RequestParam("userName") String userName,
			@RequestParam("adminPassword") String adminPassword, HttpServletRequest request) throws SQLException {

		boolean result = adminService.validate(userName, adminPassword);
		if (result == true) {
			return flightController.fetchFlightDetailsFromAdmin(request);
		} else {
			return flightController.loginFailed();
		}
	}

	@RequestMapping(value = "/deleteFlight/{flightNumber}", method = RequestMethod.GET)
	public ModelAndView deleteFlight(@PathVariable int flightNumber) {

		adminService.deleteFlight(flightNumber);
		ModelAndView model = new ModelAndView("flightDeletedSuccessful");
		return model;
	}

	@RequestMapping(value = "/addFlight", method = RequestMethod.POST)
	public ModelAndView addFlight(@ModelAttribute("flightForm") Flight flight) {
		adminService.addBook(flight);
		return new ModelAndView("redirect:/fetchFlightDetailsFromAdmin"); // data will add and return to main page
	}

	@RequestMapping("/editFlight/{flightNumber}")
	public ModelAndView editFlight(@PathVariable("flightNumber") int flightNumber) {
		ModelAndView modelAndView = new ModelAndView();
		Flight flight = adminService.UpdateFlight(flightNumber);

		modelAndView.addObject("flightForm", flight);
		modelAndView.setViewName("addFlight");
		return modelAndView;
	}

	@RequestMapping(value = "/addFlight", method = RequestMethod.GET)
	public ModelAndView addFlight() {
		ModelAndView modelAndView = new ModelAndView();
		Flight flight = new Flight();
		modelAndView.addObject("flightForm", flight);
		modelAndView.setViewName("addFlight");
		return modelAndView;
	}

}
