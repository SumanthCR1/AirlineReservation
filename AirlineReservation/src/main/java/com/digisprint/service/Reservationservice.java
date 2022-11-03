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

import com.digisprint.model.Flight;
import com.digisprint.model.Passanger;
import com.digisprint.model.Reservation;
import com.digisprint.repository.ReservationRepository;


@Component
@Service

public class ReservationService {

	@Autowired
	ReservationRepository reservationrepo;

	Reservation user;
	
	public String savedetails(@RequestParam("Flightnumber") int FlightNumber,
			@RequestParam("FlightName") String FlightName, @RequestParam("starts") String FlightStartsFrom,
			@RequestParam("destination") String Destination, @RequestParam("arrivaltime") Time ArrivalTime,
			@RequestParam("departuretime") Time DepartureTime, @RequestParam("passname") String PassangerName,
			@RequestParam("passangerage") int PassangerAge, @RequestParam("noofseats") int NumberOfSeats,
			@RequestParam("firstname") String userName, @RequestParam("emailid") String UserEmailid,
			@RequestParam("phonenumber") String UserPhoneNumber,
			@RequestParam("date") Date date,ModelMap modelMap) {
		
		System.out.println("Comming in");
		System.out.println(FlightNumber);
		user = new Reservation();

		user.setBookingID(user.getBookingID());
		user.setFlightNumber(FlightNumber);
		user.setFlightName(FlightName);
		user.setFlightStartsFrom(FlightStartsFrom);
		user.setDestination(Destination);
		user.setArrivalTime(ArrivalTime);
		user.setDepartureTime(DepartureTime);
		user.setPassangerName(PassangerName);
		user.setPassangerAge(PassangerAge);
		user.setNumberOfSeats(NumberOfSeats);
		user.setUserName(userName);
		user.setUserEmailid(UserEmailid);
		user.setUserPhoneNumber(UserPhoneNumber);
		user.setBookedDate(date);
		System.out.println("Hello");
		this.reservationrepo.save(user);

		modelMap.put("BookingID", user.getBookingID());
		modelMap.put("FlightNumber", FlightNumber);
		modelMap.put("FlightName", FlightName);
		modelMap.put("FlightStartsFrom", FlightStartsFrom);
		modelMap.put("Destination", Destination);
		modelMap.put("ArrivalTime", ArrivalTime);
		modelMap.put("DepartureTime", DepartureTime);
		modelMap.put("PassangerName", PassangerName);
		modelMap.put("PassangerAge", PassangerAge);
		modelMap.put("NumberOfSeats", NumberOfSeats);
		modelMap.put("UserName", userName);
		modelMap.put("UserEmailid", UserEmailid);
		modelMap.put("UserPhoneNumber", UserPhoneNumber);
		modelMap.put("date", date);

		return "viewreservation";
	}
	
	public Reservation booking(int id) {

		 Reservation user1=reservationrepo.findById(id).get();
		
		  return user1;
	}
	
	
	  public List<Reservation> bookedHistory(String userName) {
	  
		List<Reservation> user1=reservationrepo.findAllByUserName(userName);
	
	  return user1; 
	  }
	  
	  
		public List<Reservation> userlist() {
			  
			  List<Reservation> user = new ArrayList<Reservation>();
			 List<Reservation> result=(List<Reservation>) reservationrepo.findAll();
			return result;
		
	}

		public void deleteflight(int bookingID) {
			reservationrepo.deleteById(bookingID);
		}
		
}
