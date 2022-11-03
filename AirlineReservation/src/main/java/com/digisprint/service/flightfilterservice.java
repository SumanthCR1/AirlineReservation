package com.digisprint.service;

import java.util.List;
import java.util.stream.Collectors;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.digisprint.model.Flight;
import com.digisprint.repository.FlightFilterRepository;

@Component
@Service

public class FlightFilterService {
	@Autowired
	FlightFilterRepository flightfilterrepository;
	
	public List<Flight> resultFilter(String data, String from, String to){
		List<Flight> flight;
		//List<Flight> flight= (List<Flight>) flightfilterrepository.findAll();
		switch(data) {
		case("price"):
		
				List<Flight> sortedflights1=	flightfilterrepository.findAll(Sort.by("price"));
		
			flight=sortedflights1.stream().filter(i->i.getStartsfrom().startsWith(from)&& i.getDestination().startsWith(to)).collect(Collectors.toList());
			break;
		case("arrivaltime"):
		
			List<Flight> sortedflights2=	flightfilterrepository.findAll(Sort.by("arrivaltime"));
		
			flight=sortedflights2.stream().filter(i->i.getStartsfrom().startsWith(from)&& i.getDestination().startsWith(to)).collect(Collectors.toList());
			break;
		case("numberofseatsavailable"):
	
			List<Flight> sortedflights3=	flightfilterrepository.findAll(Sort.by("numberofseatsavailable"));
			
			flight=sortedflights3.stream().filter(i->i.getStartsfrom().startsWith(from)&& i.getDestination().startsWith(to)).collect(Collectors.toList());
			break;
		case("flightname"):
	
			List<Flight> sortedflights4=	flightfilterrepository.findAll(Sort.by("flightname"));
	
			flight=sortedflights4.stream().filter(i->i.getStartsfrom().startsWith(from)&& i.getDestination().startsWith(to)).collect(Collectors.toList());
		break;
		case("traveltime"):
			
			List<Flight> sortedflights6=	flightfilterrepository.findAll(Sort.by("traveltime"));
	
			flight=sortedflights6.stream().filter(i->i.getStartsfrom().startsWith(from)&& i.getDestination().startsWith(to)).collect(Collectors.toList());
		break;
		
		case("flightnumber"):
			
			List<Flight> sortedflights7=	flightfilterrepository.findAll(Sort.by("flightnumber"));
	
			flight=sortedflights7.stream().filter(i->i.getStartsfrom().startsWith(from)&& i.getDestination().startsWith(to)).collect(Collectors.toList());
		break;
		
		default:
			List<Flight> sortedflights5=	flightfilterrepository.findAll();
			
			flight=sortedflights5.stream().filter(i->i.getStartsfrom().startsWith(from)&& i.getDestination().startsWith(to)).collect(Collectors.toList());
				
		}
		
		return flight;	
	}	
	
	public Flight find(int flightnumber) {
		Flight flights = flightfilterrepository.findByflightnumber(flightnumber);
		return flights;
	}
	
}  