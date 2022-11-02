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
import com.digisprint.repository.Flightrepository;
import com.digisprint.repository.Loginrepository;
import com.digisprint.repository.adminrepository;

@Component
@Service
public class adminService {

	@Autowired
	Flightrepository flightrepository;
	
	@Autowired
	adminrepository adminrepo;

	public boolean validate(String name, String password) {
		System.out.println("Comming in");
	
       
        if(name.equals("Admin")&&password.equals("123"))
        {
        	System.out.println("Trueee");
            return true;
        }
        else
            return false;
		
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
