package com.digisprint.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Passanger;
import com.digisprint.model.Reservation;
import com.digisprint.service.FlightService;
import com.digisprint.service.LoginService;
import com.digisprint.service.PassangerService;
import com.digisprint.service.ReservationService;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

@RestController
public class PassangerController {

	PassangerService passangerService;
	LoginService loginService;
	FlightService flightService;
	ReservationService reservationService;
	FlightController flightController;
	Passanger passanger;

	public PassangerController(PassangerService passangerService, LoginService loginService,
			FlightService flightService, ReservationService reservationService, FlightController flightController) {

		this.passangerService = passangerService;
		this.loginService = loginService;
		this.flightService = flightService;
		this.reservationService = reservationService;
		this.flightController = flightController;

	}

	@GetMapping("/")
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView("welcomePage");
		return model;
	}

	@GetMapping("/index")
	public ModelAndView indexPage() {
		ModelAndView model = new ModelAndView("indexPage");
		return model;
	}

	@GetMapping("/registration")
	public ModelAndView userRegistration() {
		ModelAndView model = new ModelAndView("register");
		return model;
	}

	@GetMapping("/login")
	public ModelAndView loginpage() {
		ModelAndView model = new ModelAndView("loginPage");
		return model;
	}

	@PostMapping("/filter")
	public ModelAndView login(HttpServletRequest request, ModelMap model) throws SQLException {

		Passanger result = loginService.validateData(request);
		passanger = loginService.getData(request.getParameter("firstName"));
		if (Objects.nonNull(result)) {
			return flightController.fetchRowsLogin(request);
		} else {

			return flightController.loginFailed();
		}
	}

	@PostMapping("/details")
	public ModelAndView viewDetails(@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("age") int age,
			@RequestParam("gender") String gender, @RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("contactAddress") String contactAddress, @RequestParam("emailId") String emailId,
			@RequestParam("password") String password, ModelMap modelMap) {

		return passangerService.details(firstName, lastName, age, gender, phoneNumber, contactAddress, emailId,
				password, modelMap);
	}

	@GetMapping("/userProfile")
	public ModelAndView userprofile(ModelMap map) {
		ModelAndView model = new ModelAndView("userProfile");
		map.put("user", passanger);

		return model;
	}

	@GetMapping("/fetchPassangerDetails")
	public ModelAndView fetchAllPassanger(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("getAllPassanger");
		List<Passanger> customer = passangerService.userList();
		request.setAttribute("list", customer);
		return model;
	}

	@GetMapping("/fetchReservedPassangerDetails")
	public ModelAndView fetchAllReservedPassanger(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("getAllReservedPassanger");
		List<Reservation> Reserve = reservationService.userList();
		request.setAttribute("data", Reserve);
		return mv;
	}

	@RequestMapping(value = "/addPassanger", method = RequestMethod.POST)
	public ModelAndView addPassanger(@ModelAttribute("passangerform") Passanger passanger) {
		passangerService.addPassanger(passanger);

		return new ModelAndView("redirect:/userprofile"); // data will add and return to main page
	}

	@GetMapping("/editPassangerData/{id}")
	public ModelAndView editUser() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("passangerform", passanger);
		modelAndView.setViewName("editPassanger");

		return modelAndView;
	}

	@RequestMapping(value = "/addPassanger", method = RequestMethod.GET)
	public ModelAndView addUser() {
		ModelAndView modelAndView = new ModelAndView();
		Passanger passanger = new Passanger();
		modelAndView.addObject("passangerform", passanger);
		modelAndView.setViewName("editpassanger");
		return modelAndView;
	}

}
