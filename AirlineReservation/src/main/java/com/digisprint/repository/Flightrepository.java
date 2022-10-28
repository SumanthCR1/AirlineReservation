package com.digisprint.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.digisprint.model.Flight;

@Repository
public interface Flightrepository  extends CrudRepository<Flight,Integer> {
	public List <Flight> findAllByflightnumber(int flightno);
//	@Query("SELECT * FROM Flight orderby price")
//	public List<Flight> listItemsWithPriceOver(@Param("data") int data);
}
