package com.digisprint.service;

import java.sql.Date;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.model.Flight;
import com.digisprint.model.Passanger;
import com.digisprint.model.Reservation;
import com.digisprint.repository.ReservationRepository;

@Component
@Service

public class ReservationService {

	ReservationRepository reservationRepository;
	
	public ReservationService(ReservationRepository reservationRepository) {
	
		this.reservationRepository = reservationRepository;
	}

	public ModelAndView saveDetails(int flightNumber,String flightName, String flightStartsFrom,
			String destination, Time arrivalTime, Time departureTime, String passangerName,
			int passangerAge, int  numberOfSeats, String userName, String userEmailId,
			 String userPhoneNumber,Date date,ModelMap modelMap) {
		
		Reservation user = new Reservation();

		user.setBookingID(user.getBookingID());
		user.setFlightNumber(flightNumber);
		user.setFlightName(flightName);
		user.setFlightStartsFrom(flightStartsFrom);
		user.setDestination(destination);
		user.setArrivalTime(arrivalTime);
		user.setDepartureTime(departureTime);
		user.setPassangerName(passangerName);
		user.setPassangerAge(passangerAge);
		user.setNumberOfSeats(numberOfSeats);
		user.setUserName(userName);
		user.setUserEmailid(userEmailId);
		user.setUserPhoneNumber(userPhoneNumber);
		user.setBookedDate(date);
		
		this.reservationRepository.save(user);

		modelMap.put("bookingID", user.getBookingID());
		modelMap.put("flightNumber", flightNumber);
		modelMap.put("flightName", flightName);
		modelMap.put("flightStartsFrom", flightStartsFrom);
		modelMap.put("destination", destination);
		modelMap.put("arrivalTime", arrivalTime);
		modelMap.put("departureTime", departureTime);
		modelMap.put("passangerName", passangerName);
		modelMap.put("passangerAge", passangerAge);
		modelMap.put("numberOfSeats", numberOfSeats);
		modelMap.put("userName", userName);
		modelMap.put("userEmailiId", userEmailId);
		modelMap.put("userPhoneNumber", userPhoneNumber);
		modelMap.put("date", date);

		ModelAndView model= new ModelAndView("viewReservation");
		return model;
	}
	

public Reservation booking(int id) throws NullPointerException{

		 Reservation userData=reservationRepository.findById(id);
		  return userData;
	}
	
	  public List<Reservation> bookedHistory(String userName) {
	  
		List<Reservation> user=reservationRepository.findAllByuserName(userName);
	
	  return user; 
	  }
	  
	  
		public List<Reservation> userList() {
			  
			  List<Reservation> user = new ArrayList<Reservation>();
			 List<Reservation> result=(List<Reservation>) reservationRepository.findAll();
			return result;
		
	}

		public void deleteFlight(int bookingID) {
			reservationRepository.deleteById(bookingID);
		}
		
}
