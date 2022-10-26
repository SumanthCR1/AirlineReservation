package com.digisprint.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digisprint.model.Flight;
import com.digisprint.model.Passanger;
@Repository
public interface adminrepository extends CrudRepository<Flight,Integer> {
	
}
