package com.digisprint.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.repository.Flightrepository;
import com.digisprint.repository.flightfilterrepository;
import com.digisprint.service.FlightService;
import com.digisprint.service.flightfilterservice;

@Controller
@Component
public class flightfiltercontroller {

	Flight flights;

	@Autowired
	FlightService flightservice;

	@Autowired
	flightfilterservice flightfilterservice;


	@PostMapping("/datadisplay")
	public ModelAndView filterdata(@RequestParam("data") String data, HttpServletRequest request,
			@RequestParam("from") String from, @RequestParam("to") String to, ModelMap map) {

		System.out.println(data);
		System.out.println(from);
		System.out.println(to);
	
		map.put("from", from);
		map.put("to", to);
		List<Flight> flights = flightfilterservice.resultFilter(data, from, to);
		
		ModelAndView mv = new ModelAndView("getflight");

		request.setAttribute("result", flights);

		return mv;
	}

	@PostMapping("/datadisplayafterlogin")
	public ModelAndView filterafterlogin(@RequestParam("data") String data, HttpServletRequest request,
			@RequestParam("from") String from, @RequestParam("to") String to, ModelMap map) {
		System.out.println(data);
		map.put("from", from);
		map.put("to", to);
		List<Flight> flights = flightfilterservice.resultFilter(data, from, to);

		ModelAndView mv = new ModelAndView("Loginsuccess");

		request.setAttribute("resultlogin", flights);

		return mv;
	}

	@PostMapping("/filterafterlogin")
	public ModelAndView datafilterafterlogin(@RequestParam("data") String data, HttpServletRequest request,
			@RequestParam("from") String from, @RequestParam("to") String to) {

		System.out.println(data);

		List<Flight> flights = flightfilterservice.resultFilter(data, from, to);

		ModelAndView mv = new ModelAndView("Loginsuccess");

		request.setAttribute("resultlogin", flights);

		return mv;
	}

	@PostMapping("/Searchstatus/{flightnumber}")

	public ModelAndView flightstatus(@PathVariable int flightnumber, HttpServletRequest request, ModelMap map,
			@RequestParam("number") int number, @RequestParam("date") Date date) {
		System.out.println("Search");
		System.out.println(flightnumber);
		ModelAndView model = new ModelAndView("Confirmflight");
		flights=flightfilterservice.find(flightnumber);
	
		System.out.println(flights);
		request.setAttribute("flightform", flights);
		map.put("date", date);
		map.put("number", number);

		model.setViewName("Confirmflight");

		return model;

	}

	@GetMapping("confirmingdataafter")
	public ModelMap flightconfirmdatafinal(ModelMap map) {

		map.put("number", flights.getFlightnumber());
		map.put("name", flights.getFlightname());
		map.put("starts", flights.getStartsfrom());
		map.put("destination", flights.getDestination());
		map.put("arrivaltime", flights.getArrivaltime());
		map.put("departuretime", flights.getDeparturetime());
		map.put("price", flights.getPrice());
		return map;

	}

}