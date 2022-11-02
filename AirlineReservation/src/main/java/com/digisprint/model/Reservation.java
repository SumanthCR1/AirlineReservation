package com.digisprint.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
@Entity
@Table(name="reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int BookingID;
	@Column
	private int FlightNumber;
	@Column
	private String FlightName;
	@Column
	private String FlightStartsFrom;
	@Column
	private String Destination;
	@Column
	private Date BookedDate;
	@Column
	private Time ArrivalTime;
	@Column
	private Time DepartureTime;
	@Column
	private String PassangerName;
	@Column
	private int PassangerAge;
	@Column
	private int NumberOfSeats;
	@Column
	private String userName;
	@Column
	private String UserEmailid;
	@Column
	private String UserPhoneNumber;
	
	
	
	public int getBookingID() {
		return BookingID;
	}
	public void setBookingID(int bookingID) {
		BookingID = bookingID;
	}
	public int getFlightNumber() {
		return FlightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		FlightNumber = flightNumber;
	}
	public String getFlightName() {
		return FlightName;
	}
	public void setFlightName(String flightName) {
		FlightName = flightName;
	}
	public String getFlightStartsFrom() {
		return FlightStartsFrom;
	}
	public void setFlightStartsFrom(String flightStartsFrom) {
		FlightStartsFrom = flightStartsFrom;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public Date getBookedDate() {
		return BookedDate;
	}
	public void setBookedDate(Date bookedDate) {
		BookedDate = bookedDate;
	}
	public Time getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(Time arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	public Time getDepartureTime() {
		return DepartureTime;
	}
	public void setDepartureTime(Time departureTime) {
		DepartureTime = departureTime;
	}
	public String getPassangerName() {
		return PassangerName;
	}
	public void setPassangerName(String passangerName) {
		PassangerName = passangerName;
	}
	public int getPassangerAge() {
		return PassangerAge;
	}
	public void setPassangerAge(int passangerAge) {
		PassangerAge = passangerAge;
	}
	public int getNumberOfSeats() {
		return NumberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		NumberOfSeats = numberOfSeats;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		userName = userName;
	}
	public String getUserEmailid() {
		return UserEmailid;
	}
	public void setUserEmailid(String userEmailid) {
		UserEmailid = userEmailid;
	}
	public String getUserPhoneNumber() {
		return UserPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		UserPhoneNumber = userPhoneNumber;
	}
	@Override
	public String toString() {
		return "Reservation [BookingID=" + BookingID + ", FlightNumber=" + FlightNumber + ", FlightName=" + FlightName
				+ ", FlightStartsFrom=" + FlightStartsFrom + ", Destination=" + Destination + ", BookedDate="
				+ BookedDate + ", ArrivalTime=" + ArrivalTime + ", DepartureTime=" + DepartureTime + ", PassangerName="
				+ PassangerName + ", PassangerAge=" + PassangerAge + ", NumberOfSeats=" + NumberOfSeats + ", UserName="
				+ userName + ", UserEmailid=" + UserEmailid + ", UserPhoneNumber=" + UserPhoneNumber + "]";
	}

	
	
}
