package com.digisprint.controller;

import java.sql.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.model.Reservation;
import com.digisprint.service.LoginService;
import com.digisprint.service.ReservationService;

@RestController
public class ReservationController {

	ReservationService reserveService;
	LoginService loginService;
	FlightFilterController flightFilterController;
	Flight flightList;
	String userName;
	int numberOfSeats, age;
	Date date;
	
	
	public ReservationController(ReservationService reserveService, LoginService loginService,
			FlightFilterController flightFilterController) {
		this.reserveService = reserveService;
		this.loginService = loginService;
		this.flightFilterController = flightFilterController;
	}

	 @GetMapping("/searchBookedHistory") 
	  public ModelAndView bookedHistory(@RequestParam ("userName") String userName, HttpServletRequest request, ModelMap map) {
		List<Reservation> result=reserveService.bookedHistory(userName);	
		ModelAndView model=new ModelAndView("userHistory");
		map.put("user", result);
		 return model;
		 }
	 
	  @PostMapping("/searchBookedStatus") 
	  public ModelAndView flightStatus(@RequestParam ("bookingID") int bookingId, ModelMap map) throws NullPointerException{
	  
		  Reservation result=reserveService.booking(bookingId); 
	 	if (result!=null) {
		 ModelAndView model= new ModelAndView("particularReservation");
		  map.put("user", result);
		  return model;
		} else {
			ModelAndView model=new ModelAndView("bookedStatusFailed");
			return model;
		}
	  }
	 
	@GetMapping("/checkOut")
	public ModelAndView checkingOutPassanger(@RequestParam("number") int newNumber, @RequestParam("age") int newAge,
			@RequestParam("price") int price, @RequestParam("passangerName") String passangerName,
			@RequestParam("date") Date givendate, HttpServletRequest request, 
		ModelMap map) {
		ModelAndView model=new ModelAndView("confirmPayment");
		loginService.getReservation(map);
		numberOfSeats = newNumber;
		age = newAge;
		userName = passangerName;
		date= givendate;
			
		int total = numberOfSeats * price;
		map.put("Total", total);	
		return model;
	}

	@GetMapping("/confirmedReservation")
	public ModelAndView Final(@RequestParam("firstName") String firstName, @RequestParam("emailId") String emailId,
			@RequestParam("phoneNumber") String phoneNumber,ModelMap map) {
		
		flightList = flightFilterController.flights;
		return reserveService.saveDetails(flightList.getFlightNumber(), flightList.getFlightName(), flightList.getStartsFrom(),
				flightList.getDestination(), flightList.getArrivalTime(), flightList.getDepartureTime(), userName, age,
				numberOfSeats, firstName, emailId, phoneNumber,date, map);

	}
	@RequestMapping(value = "/deleteHistory/{bookingID}", method = RequestMethod.GET)
	public ModelAndView deleteBookedHistory(@PathVariable int bookingID) {
		ModelAndView model= new ModelAndView("reservationCancelledSuccessful");
		reserveService.deleteFlight(bookingID);

		return model;

	}

}
