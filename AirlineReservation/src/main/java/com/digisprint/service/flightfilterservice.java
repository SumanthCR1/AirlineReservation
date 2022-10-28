package com.digisprint.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.digisprint.model.Flight;
import com.digisprint.repository.Flightrepository;

@Component
@Service

public class flightfilterservice {
	@Autowired
	Flightrepository flightrepository;
	
	public List<Flight> resultFilter(){
	
		return null;	
	}
}