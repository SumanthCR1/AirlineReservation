package com.digisprint.controller;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.repository.Flightrepository;
import com.digisprint.repository.flightfilterrepository;
import com.digisprint.service.FlightService;

@Controller
@Component
public class flightfiltercontroller {

	Flight flights;
	
	@Autowired
	FlightService flightservice;
	

	@Autowired
	flightfilterrepository  flightrepo;
	
	@Autowired  
    JdbcTemplate jdbc;
	
	@PostMapping("/datadisplay")
	public ModelAndView filterdata(@RequestParam ("data") String data, HttpServletRequest request){
		
		System.out.println(data);
		
	//	jdbc.execute("select * from Flight order by "+data);
		
		ArrayList<Flight> flights=  (ArrayList<Flight>) flightrepo.findAll(Sort.by(data));

		ModelAndView mv= new ModelAndView("getflight");
		
		request.setAttribute ("result", flights);

	return mv;
	}
	
	@PostMapping("/datadisplayafterlogin")
	public ModelAndView filterdataafterlogin(@RequestParam ("data") String data, HttpServletRequest request){
		
		System.out.println(data);
		
	//	jdbc.execute("select * from Flight order by "+data);
		
		ArrayList<Flight> flights=  (ArrayList<Flight>) flightrepo.findAll(Sort.by(data));

		ModelAndView mv= new ModelAndView("Loginsuccess");
		
		request.setAttribute ("resultlogin", flights);

	return mv;
	}
	
	@GetMapping("/booking")
	public String research() {
		System.out.println("Book");
		return "Book";
		
	}
	@PostMapping("/Searchstatus")
	public String flightstatus(@RequestParam ("flightno") int flightno, HttpServletRequest request,ModelMap map){
		System.out.println("Search");

		flights=  flightrepo.findByflightnumber(flightno);

		map.put("flightdetails", flights);
		 
	
	return "particularflight";
	
	}


	@GetMapping("confirmingdata")
	public String flightconfirmdata(ModelMap map) {
		
		map.put("number", flights.getFlightnumber());
		map.put("name", flights.getFlightname());
		map.put("starts", flights.getStartsfrom());
		map.put("destination", flights.getDestination());
		map.put("arrivaltime", flights.getArrivaltime());
		map.put("departuretime", flights.getDeparturetime());		
		map.put("price", flights.getPrice());	
		return "Confirmflight";
		
	}
	
	
}