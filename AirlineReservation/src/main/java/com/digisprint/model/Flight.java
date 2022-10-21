package com.digisprint.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Flight {

	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int flightnumber;
	@Column
	private String flightname;
	@Column
	private String startsfrom;
	@Column
	private String destination;
	@Column
	private Time arrivaltime;
	@Column
	private Time departuretime;
	@Column
	private Time traveltime;
	@Column
	private int totalcapacity;
	@Column
	private int numberofseatsavailable;
	@Column
	private String typesofseatsavailable;
	@Column
	private int price;
	
	

	public int getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(int flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}



	public String getStartsfrom() {
		return startsfrom;
	}



	public void setStartsfrom(String startsfrom) {
		this.startsfrom = startsfrom;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public Time getArrivaltime() {
		return arrivaltime;
	}



	public void setArrivaltime(Time arrivaltime) {
		this.arrivaltime = arrivaltime;
	}



	public Time getDeparturetime() {
		return departuretime;
	}



	public void setDeparturetime(Time departuretime) {
		this.departuretime = departuretime;
	}



	public Time getTraveltime() {
		return traveltime;
	}



	public void setTraveltime(Time traveltime) {
		this.traveltime = traveltime;
	}



	public int getTotalcapacity() {
		return totalcapacity;
	}



	public void setTotalcapacity(int totalcapacity) {
		this.totalcapacity = totalcapacity;
	}



	public int getNumberofseatsavailable() {
		return numberofseatsavailable;
	}



	public void setNumberofseatsavailable(int numberofseatsavailable) {
		this.numberofseatsavailable = numberofseatsavailable;
	}



	public String getTypesofseatsavailable() {
		return typesofseatsavailable;
	}



	public void setTypesofseatsavailable(String typesofseatsavailable) {
		this.typesofseatsavailable = typesofseatsavailable;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "FlightController [flightnumber=" + flightnumber + ", flightname=" + flightname + ", startsfrom="
				+ startsfrom + ", destination=" + destination + ", arrivaltime=" + arrivaltime + ", departuretime="
				+ departuretime + ", traveltime=" + traveltime + ", totalcapacity=" + totalcapacity
				+ ", numberofseatsavailable=" + numberofseatsavailable + ", typesofseatsavailable="
				+ typesofseatsavailable + ", price=" + price + "]";
	}
	

}
