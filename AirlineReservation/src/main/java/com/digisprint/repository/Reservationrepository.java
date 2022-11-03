package com.digisprint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.digisprint.model.Passanger;
import com.digisprint.model.Reservation;
@Repository
@Component
public interface ReservationRepository extends JpaRepository<Reservation,Integer> {

	List<Reservation> findAllByUserName(String name);


}
