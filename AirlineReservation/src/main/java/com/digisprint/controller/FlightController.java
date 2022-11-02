package com.digisprint.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.repository.Flightrepository;
import com.digisprint.service.FlightService;

@Controller
@Component

public class FlightController {
	
	@Autowired
	FlightService flightservice;
	
	@GetMapping("/addflight1st")
	public String Entry() {
		return "addnewflight";
	}
	
	@PostMapping("/addflight2nd")
	public String addflights(@RequestParam("flightnumber") int flightnumber, @RequestParam("flightname") String flightname,
			@RequestParam("startsfrom") String startsfrom, @RequestParam("destination") String destination,
			@RequestParam("arrivaltime") Time arrivaltime, @RequestParam("departuretime") Time departuretime,
			@RequestParam("traveltime") Time traveltime, @RequestParam("totalcapacity") int totalcapacity,
			@RequestParam("numberofseatsavailable") int numberofseatsavailable, @RequestParam("typesofseatsavailable") String typesofseatsavailable,
			 @RequestParam("price") int price, ModelMap map) {

		return flightservice.addflights(flightnumber, flightname, startsfrom, destination, arrivaltime, departuretime, traveltime, totalcapacity, numberofseatsavailable, typesofseatsavailable, price, map);
	}
	
	@GetMapping("/fetchallflightdetails")
	public ModelAndView fetchallRows ( HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("getflight");
		
		List <Flight> ft=flightservice.flightlist();
		//List<Flight> res =ft.stream().filter(i->i.getStartsfrom().equalsIgnoreCase(from)&& i.getDestination().equalsIgnoreCase(to)).collect(Collectors.toList());    //.filter(a->a.getDestination().equalsIgnoreCase(to)).collect(Collectors.toList());
		request.setAttribute ("result", ft);
	
		return mv;
	}
	
	@GetMapping("/fetchflightdetails")
	public ModelAndView fetchRows ( HttpServletRequest request, @RequestParam ("from") String from,@RequestParam("to") String to ,ModelMap map) {
		ModelAndView mv= new ModelAndView("getflight");
		System.out.println(from);
		System.out.println(to);
		List <Flight> ft=flightservice.flightlist();
		List<Flight> res =ft.stream().filter(i->i.getStartsfrom().equalsIgnoreCase(from)&& i.getDestination().equalsIgnoreCase(to)).collect(Collectors.toList());    //.filter(a->a.getDestination().equalsIgnoreCase(to)).collect(Collectors.toList());
		request.setAttribute ("result", res);
		map.put("from", from);
		map.put("to", to);
		return mv;
	}
	@GetMapping("/fetchflightdetailslogin")
	public String fetchRowslogin ( HttpServletRequest request) {
	
		return "indexformafterlogin";
	}
	
	@GetMapping("/fetchflightdetailslogin2nd")
	public ModelAndView fetchRowslogin2nd ( HttpServletRequest request, @RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("number") String number,@RequestParam("date") Date date, ModelMap map) {
		ModelAndView mv= new ModelAndView("Loginsuccess");
		List <Flight> ft=flightservice.flightlist();
		List <Flight> flight=ft.stream().filter(i->i.getStartsfrom().startsWith(from)&&i.getDestination().startsWith(to)).collect(Collectors.toList());
		map.put("from", from);
		map.put("to", to);
		map.put("date", date);
		map.put("number", number);
		request.setAttribute ("resultlogin", flight);
		request.setAttribute("flight1", ft.get(1));
		return mv;
	}
	
	@GetMapping("failed")
	public String Loginfailed() {
		ModelAndView mv= new ModelAndView("Loginfailed");
		return "";
	}			
		
	@GetMapping("/fetchflightdetailsfromadmin")
	public ModelAndView fetchflightdetailsfromadmin ( HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("fetchflightbyadmin");
		List <Flight> ft=flightservice.flightlist();
		request.setAttribute ("fromadmin", ft);
		System.out.println("Abcd");
		return mv;
	}	
  
}
