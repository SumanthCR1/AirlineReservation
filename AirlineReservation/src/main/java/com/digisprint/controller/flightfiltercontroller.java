package com.digisprint.controller;

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
		//List <Flight> ft=flightservice.flightlist();
		request.setAttribute ("result", flights);
		
		//return mv;
	
		
	return mv;
	}
	public void research(@RequestParam("search") String search, HttpServletRequest request) {
		
		ModelAndView mv= new ModelAndView("getflight");
		List <Flight> ft=flightservice.flightlist();
		ft.stream().filter(i->i.getFlightname().startsWith(search));
		request.setAttribute ("result", ft);
	}
	
	
	
}