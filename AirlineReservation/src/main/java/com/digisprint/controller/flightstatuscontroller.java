package com.digisprint.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.digisprint.model.Flight;
import com.digisprint.service.FlightService;

@Controller
@Component
public class flightstatuscontroller {

	@Autowired
	FlightService flightservice;
	
	@GetMapping("/flightstatusdisplay")
	public ModelAndView fetchRowsdata (@RequestParam ("flightdata") String flightdata) {
		/*
		 * @Query("select * from flight where startsfrom (?)") Collection<Flight>
		 * findAll();
		 */
		
			System.out.println(flightdata);
				
		return null;
	}
}