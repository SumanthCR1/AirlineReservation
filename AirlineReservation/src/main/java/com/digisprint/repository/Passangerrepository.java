package com.digisprint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digisprint.model.Passanger;
@Repository
public interface Passangerrepository extends CrudRepository<Passanger,Integer> {
	Passanger findByfirstname(String firstname);
}
