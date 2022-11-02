package com.digisprint.controller;

import java.security.Provider.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.model.Flight;
import com.digisprint.model.Reservation;

import com.digisprint.service.LoginService;
import com.digisprint.service.PassangerService;
import com.digisprint.service.Reservationservice;

@Controller
@Component
public class reservationcontroller {

	@Autowired
	Reservationservice reserveservice;

	@Autowired
	LoginService loginservice;
	
	@Autowired
	flightfiltercontroller filtercontroller;
	
	Flight flightlist;
	String name;
	int number, age;
	Date date;

	 @GetMapping("/Searchbookedhistory") 
	  public String BookedHistory(@RequestParam ("userName") String userName, HttpServletRequest request, ModelMap map) {
		 System.out.println(userName);
		
		List<Reservation> result=reserveservice.bookedHistory(userName);
		
		System.out.println(result);
		
		map.put("user", result);
		 return "userhistory";
		 }
	
	  @PostMapping("/Searchbookedstatus") 
	  public ModelAndView flightstatus(@RequestParam
	  ("bookingID") int bookingid, ModelMap map){
	  System.out.println(bookingid);
	  System.out.println("Hello");
	  
	 Reservation result=reserveservice.booking(bookingid);
	 
	  ModelAndView mv= new ModelAndView("particularreservation");
	//	request.setAttribute ("user", result);
	  map.put("user", result);
	  System.out.println("out");
	  return mv;
	  }
	 

	@GetMapping("/Checkout")
	public String check(@RequestParam("number") int number1, @RequestParam("age") int age1,
			@RequestParam("price") int price, @RequestParam("passangername") String passangername,
			@RequestParam("date") Date date1, HttpServletRequest request, ModelMap map) {
		System.out.println("i am here");
		number = number1;
		age = age1;
		name = passangername;
		date= date1;
		int total = number1 * price;
		map.put("Total", total);
		return "Confirmpayment";
	}


	@GetMapping("/Confirmed")
	public String Final(@RequestParam("firstname") String firstname, @RequestParam("emailid") String emailid,
			@RequestParam("phonenumber") String phonenumber,

			ModelMap map) {
		// ModelMap str=loginservice.getreservation(map);
		flightlist = filtercontroller.flights;
		System.out.println("Comming");
		System.out.println(flightlist.getFlightname());
		return reserveservice.savedetails(flightlist.getFlightnumber(), flightlist.getFlightname(), flightlist.getStartsfrom(),
				flightlist.getDestination(), flightlist.getArrivaltime(), flightlist.getDeparturetime(), name, age,
				number, firstname, emailid, phonenumber,date, map);

	}

}
