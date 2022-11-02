package com.digisprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
import com.digisprint.model.Passanger;
import com.digisprint.model.Reservation;
import com.digisprint.repository.*;
import com.digisprint.service.FlightService;
import com.digisprint.service.LoginService;
import com.digisprint.service.PassangerService;
import com.digisprint.service.Reservationservice;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PUT;

@Controller
@Component
public class PassangerController {

	@Autowired
	PassangerService passangerService;

	@Autowired
	LoginService loginService;

	@Autowired
	FlightService flightservice;

	@Autowired
	Reservationservice reservationservice;

	@Autowired
	FlightController controller;
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
	public String login(HttpServletRequest request, ModelMap model) throws SQLException {
		System.out.println("comming into filter");

		boolean result = loginService.validate(request);
		if (result == true) {
			passanger = loginService.getdata(request.getParameter("firstname"));
			return controller.fetchRowslogin(request);

		} else {
			System.out.println("falseeee");
			return controller.Loginfailed();
		}
	}

	@PostMapping("/details")
	public String viewDetails(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
			@RequestParam("age") int age, @RequestParam("gender") String gender,
			@RequestParam("phonenumber") String phonenumber, @RequestParam("contactaddress") String contactaddress,
			@RequestParam("emailid") String emailid, @RequestParam("password") String password, ModelMap modelMap) {

		return passangerService.details(firstname, lastname, age, gender, phonenumber, contactaddress, emailid,
				password, modelMap);
	}

	@GetMapping("/userprofile")
	public String profile(ModelMap map) {
		System.out.println("Hello i am in userprofile");
		map.put("user", passanger);

		return "userprofile";
	}

	@GetMapping("/fetchpassangerdetails")
	public ModelAndView FetchAllPassanger(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("getallpassanger");
		List<Passanger> customer = passangerService.userlist();
		request.setAttribute("list", customer);

		return mv;
	}

	@GetMapping("/fetchreservedpassangerdetails")
	public ModelAndView FetchAllReservedPassanger(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("getallreservedpassanger");
		List<Reservation> Reserve = reservationservice.userlist();
		request.setAttribute("data", Reserve);

		System.out.println("Done");
		return mv;
	}

	/*
	 * 
	 * @RequestMapping(value="/addPassanger" , method=RequestMethod.POST) public
	 * ModelAndView add(@ModelAttribute("passangerform") Passanger passanger) {
	 * passangerService.addpassanger(passanger);
	 * 
	 * return new ModelAndView("redirect:/userprofile"); // data will add and return
	 * to main page }
	 * 
	 * 
	 * 
	 * 
	 * @GetMapping("/editPassangerData")
	 * 
	 * public ModelAndView edituser() { ModelAndView modelAndView = new
	 * ModelAndView(); System.out.println("coming");
	 * modelAndView.addObject("passangerform",passanger);
	 * System.out.println("come"); modelAndView.setViewName("editpassanger");
	 * 
	 * return modelAndView;
	 * 
	 * //}
	 * 
	 * @RequestMapping(value="/edidPassangerData", method = RequestMethod.POST)
	 * public ModelAndView useredit(HttpServletRequest request, ModelMap map) {
	 * ModelAndView mv= new ModelAndView("editpassanger"); Passanger passanger=
	 * passangerService.update(request); map.put("passangerform", passanger); return
	 * mv; }
	 * 
	 * 
	 * 
	 * 
	 * @RequestMapping(value="/addPassanger" , method=RequestMethod.GET) public
	 * ModelAndView adduser() { ModelAndView modelAndView = new ModelAndView();
	 * Passanger pass = new Passanger();
	 * modelAndView.addObject("passangerform",pass);
	 * modelAndView.setViewName("editpassanger"); return modelAndView; }
	 */

	@RequestMapping(value="/editpassanger" , method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("passangerform") Passanger passanger) {
		passangerService.addBook(passanger);
		return new ModelAndView("redirect:/userprofile"); // data will add and return to main page
	}

	
	@RequestMapping("/editPassangerData/{id}")
	public ModelAndView editFlight(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView();
		Passanger flight = passangerService.UpdateFlight(id);
	System.out.println(flight);
		modelAndView.addObject("passangerform",flight);
		modelAndView.setViewName("editpassanger");
		return modelAndView;
	}
	
	@RequestMapping(value="/editpassanger" , method=RequestMethod.GET)
	public ModelAndView addFlight() {
		ModelAndView modelAndView = new ModelAndView();
		Flight flight = new Flight();
		modelAndView.addObject("passangerform",flight);
		modelAndView.setViewName("editpassanger");
		return modelAndView;
	}
	

	
	
}
