package com.digisprint.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digisprint.model.Flight;
import com.digisprint.model.Passanger;
import com.digisprint.repository.FlightRepository;
import com.digisprint.repository.LoginRepository;
import com.digisprint.repository.AdminRepository;

@Component
@Service
public class AdminService {

	@Autowired
	FlightRepository flightrepository;
	
	@Autowired
	AdminRepository adminrepo;

	public boolean validate(String name, String password) {
		System.out.println("Comming in");
	
       
        return name.equals("Admin")&&password.equals("123");
       
}
	
	public void DeleteFlight(int flightnumber) {
		adminrepo.deleteById(flightnumber);
	}

	public Flight UpdateFlight(int flightnumber) {
		return adminrepo.findById(flightnumber).get();
	}
	
	public void addBook(Flight flight) {
		adminrepo.save(flight);
	}
	
	public List<Flight> getAllFlight(){
		return (List<Flight>) adminrepo.findAll();
	}
	
	}
