package com.digisprint.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int flightNumber;
	@Column
	private String flightName;
	@Column
	private String startsFrom;
	@Column
	private String destination;
	@Column
	private Time arrivalTime;
	@Column
	private Time departureTime;
	@Column
	private Time travelTime;
	@Column
	private int totalCapacity;
	@Column
	private int numberOfSeatsAvailable;
	@Column
	private String typesOfSeatsAvailable;
	
	
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
	public String getStartsFrom() {
		return startsFrom;
	}
	public void setStartsFrom(String startsFrom) {
		this.startsFrom = startsFrom;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
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
	public Time getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(Time travelTime) {
		this.travelTime = travelTime;
	}
	public int getTotalCapacity() {
		return totalCapacity;
	}
	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}
	public int getNumberOfSeatsAvailable() {
		return numberOfSeatsAvailable;
	}
	public void setNumberOfSeatsAvailable(int numberOfSeatsAvailable) {
		this.numberOfSeatsAvailable = numberOfSeatsAvailable;
	}
	public String getTypesOfSeatsAvailable() {
		return typesOfSeatsAvailable;
	}
	public void setTypesOfSeatsAvailable(String typesOfSeatsAvailable) {
		this.typesOfSeatsAvailable = typesOfSeatsAvailable;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Column
	private int price;


	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", startsFrom=" + startsFrom
				+ ", destination=" + destination + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime
				+ ", travelTime=" + travelTime + ", totalCapacity=" + totalCapacity + ", numberOfSeatsAvailable="
				+ numberOfSeatsAvailable + ", typesOfSeatsAvailable=" + typesOfSeatsAvailable + ", price=" + price
				+ "]";
	}


	
}
