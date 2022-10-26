package com.digisprint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.digisprint.model.Flight;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public interface flightfilterrepository extends PagingAndSortingRepository<Flight, Integer> {

//	@Query("SELECT * FROM Flight orderby price")
//	public List<Flight> listItemsWithPriceOver(@Param("data") int data);
	//Iterable<Flight> findAll(Sort sort);
	
	
}
