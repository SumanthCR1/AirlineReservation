package com.digisprint.service;

import java.util.List;
import java.util.stream.Collectors;

import org.jvnet.hk2.annotations.Service;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.digisprint.model.Flight;
import com.digisprint.repository.FlightFilterRepository;

@Component
@Service

public class FlightFilterService {

	FlightFilterRepository flightFilterRepository;

	public FlightFilterService(FlightFilterRepository flightFilterRepository) {

		this.flightFilterRepository = flightFilterRepository;
	}

	public List<Flight> resultFilter(String data, String from, String to) {
		List<Flight> flight;
		switch (data) {
		case ("price"):

			List<Flight> sortByPrice = flightFilterRepository.findAll(Sort.by("price"));

			flight = sortByPrice.stream()
					.filter(i -> i.getStartsFrom().startsWith(from) && i.getDestination().startsWith(to))
					.collect(Collectors.toList());
			break;
		case ("arrivalTime"):

			List<Flight> sortByArrivalTime = flightFilterRepository.findAll(Sort.by("arrivalTime"));

			flight = sortByArrivalTime.stream()
					.filter(i -> i.getStartsFrom().startsWith(from) && i.getDestination().startsWith(to))
					.collect(Collectors.toList());
			break;
		case ("numberOfSeatsAvailable"):

			List<Flight> sortedBySeats = flightFilterRepository.findAll(Sort.by("numberOfSeatsAvailable"));

			flight = sortedBySeats.stream()
					.filter(i -> i.getStartsFrom().startsWith(from) && i.getDestination().startsWith(to))
					.collect(Collectors.toList());
			break;
		case ("flightName"):

			List<Flight> sortByFlightName = flightFilterRepository.findAll(Sort.by("flightName"));

			flight = sortByFlightName.stream()
					.filter(i -> i.getStartsFrom().startsWith(from) && i.getDestination().startsWith(to))
					.collect(Collectors.toList());
			break;
		case ("travelTime"):

			List<Flight> sortByTime = flightFilterRepository.findAll(Sort.by("travelTime"));

			flight = sortByTime.stream()
					.filter(i -> i.getStartsFrom().startsWith(from) && i.getDestination().startsWith(to))
					.collect(Collectors.toList());
			break;

		case ("flightNumber"):

			List<Flight> sortByFlightNumber = flightFilterRepository.findAll(Sort.by("flightNumber"));

			flight = sortByFlightNumber.stream()
					.filter(i -> i.getStartsFrom().startsWith(from) && i.getDestination().startsWith(to))
					.collect(Collectors.toList());
			break;

		default:
			List<Flight> sort = flightFilterRepository.findAll();

			flight = sort.stream().filter(i -> i.getStartsFrom().startsWith(from) && i.getDestination().startsWith(to))
					.collect(Collectors.toList());

		}

		return flight;
	}

	public Flight find(int flightNumber) {
		Flight flights = flightFilterRepository.findByFlightNumber(flightNumber);
		return flights;
	}

}