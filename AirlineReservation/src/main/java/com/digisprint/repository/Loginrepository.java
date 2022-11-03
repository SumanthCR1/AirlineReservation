package com.digisprint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.digisprint.model.Passanger;

@Repository
public interface LoginRepository extends JpaRepository<Passanger,Integer>{
	
	Passanger findByFirstnameAndPassword(String firstname, String password);
	
}
