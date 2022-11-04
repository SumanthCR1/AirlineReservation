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
	private int bookingID;
	@Column
	private int flightNumber;
	@Column
	private String flightName;
	@Column
	private String flightStartsFrom;
	@Column
	private String destination;
	@Column
	private Date bookedDate;
	@Column
	private Time arrivalTime;
	@Column
	private Time departureTime;
	@Column
	private String passangerName;
	@Column
	private int passangerAge;
	@Column
	private int numberOfSeats;
	@Column
	private String userName;
	@Column
	private String userEmailid;
	@Column
	private String userPhoneNumber;
	
	
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightStartsFrom() {
		return flightStartsFrom;
	}
	public void setFlightStartsFrom(String flightStartsFrom) {
		this.flightStartsFrom = flightStartsFrom;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}
	public Time getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Time getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}
	public String getPassangerName() {
		return passangerName;
	}
	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}
	public int getPassangerAge() {
		return passangerAge;
	}
	public void setPassangerAge(int passangerAge) {
		this.passangerAge = passangerAge;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmailid() {
		return userEmailid;
	}
	public void setUserEmailid(String userEmailid) {
		this.userEmailid = userEmailid;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	@Override
	public String toString() {
		return "Reservation [bookingID=" + bookingID + ", flightNumber=" + flightNumber + ", flightName=" + flightName
				+ ", flightStartsFrom=" + flightStartsFrom + ", destination=" + destination + ", bookedDate="
				+ bookedDate + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + ", passangerName="
				+ passangerName + ", passangerAge=" + passangerAge + ", numberOfSeats=" + numberOfSeats + ", userName="
				+ userName + ", userEmailid=" + userEmailid + ", userPhoneNumber=" + userPhoneNumber + "]";
	}
	
	
	
}
