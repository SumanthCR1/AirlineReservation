package com.digisprint.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digisprint.model.Passanger;
import com.digisprint.repository.FlightRepository;
import com.digisprint.repository.LoginRepository;
import com.digisprint.repository.PassangerRepository;

@Component
@Service
public class LoginService {

	FlightRepository flightRepository;
	LoginRepository loginRepository;
	PassangerRepository passangerRepository;
	int id;
	String firstName, contactAddress, emailId, phoneNumber, age;

	public LoginService(FlightRepository flightRepository, LoginRepository loginRepository,
			PassangerRepository passangerRepository) {

		this.flightRepository = flightRepository;
		this.loginRepository = loginRepository;
		this.passangerRepository = passangerRepository;
	}

	public Passanger validateData(HttpServletRequest request) throws SQLException {

		Passanger user;
		
		firstName = request.getParameter("firstName");
		String password = request.getParameter("password");
		user = loginRepository.findByFirstNameAndPassword(firstName, password);
	
		if (user != null) {
			
			age = user.getGender();
			emailId = user.getEmailId();
			phoneNumber = user.getPhoneNumber();
			
		}
		return user;
	}

	public Passanger getData(String firstName) {
		Passanger passanger = passangerRepository.findByfirstName(firstName);
		return passanger;
	}

	public ModelMap getReservation(ModelMap map) {

		map.put("firstName", firstName);
		map.put("emailId", emailId);
		map.put("phoneNumber", phoneNumber);
		return map;

	}

}
