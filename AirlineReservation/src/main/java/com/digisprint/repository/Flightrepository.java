package com.digisprint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digisprint.model.Flight;

@Repository
public interface Flightrepository  extends CrudRepository<Flight,Integer> {

}
