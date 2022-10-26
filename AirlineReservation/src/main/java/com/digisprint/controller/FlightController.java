package com.digisprint.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.service.FlightService;

@Controller
@Component

public class FlightController {
	
	@Autowired
	FlightService flightservice;
	
	@GetMapping("/fetchflightdetails")
	public ModelAndView fetchRows ( HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("getflight");
		List <Flight> ft=flightservice.flightlist();
		request.setAttribute ("result", ft);
		
		return mv;
	}
	
	
	
  
}
