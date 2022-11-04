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


	FlightRepository flightRepository;
	AdminRepository adminRepository;


	public AdminService(FlightRepository flightRepository, AdminRepository adminRepository) {
		this.flightRepository = flightRepository;
		this.adminRepository = adminRepository;
	}

	public boolean validate(String name, String password) {
        return name.equals("Admin")&&password.equals("123");
}
	
	public void deleteFlight(int flightNumber) {
		adminRepository.deleteById(flightNumber);
	}

	public Flight UpdateFlight(int flightNumber) {
		return adminRepository.findById(flightNumber).get();
	}
	
	public void addBook(Flight flight) {
		adminRepository.save(flight);
	}
	
	public List<Flight> getAllFlight(){
		return (List<Flight>) adminRepository.findAll();
	}
	
	}
