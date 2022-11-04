package com.digisprint.service;

import java.util.ArrayList;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.model.Passanger;
import com.digisprint.repository.PassangerRepository;

@Component
@Service
public class PassangerService {

	PassangerRepository passangerRepository;

	public PassangerService(PassangerRepository passangerRepository) {

		this.passangerRepository = passangerRepository;
	}

	public ModelAndView details(String firstName, String lastName, int age, String gender, String phoneNumber,
			String contactAddress, String emailId, String password, ModelMap modelMap) {

		Passanger user = new Passanger();

		user.setId(user.getId());
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		user.setGender(gender);
		user.setPhoneNumber(phoneNumber);
		user.setContactAddress(contactAddress);
		user.setEmailId(emailId);
		user.setPassword(password);
		this.passangerRepository.save(user);
		modelMap.put("id", user.getId());
		modelMap.put("firstName", firstName);
		modelMap.put("lastName", lastName);
		modelMap.put("age", age);
		modelMap.put("gender", gender);
		modelMap.put("phoneNumber", phoneNumber);
		modelMap.put("contactAddress", contactAddress);
		modelMap.put("emailId", emailId);
		modelMap.put("password", password);

		ModelAndView model = new ModelAndView("viewPassanger");
		return model;

	}

	public List<Passanger> userList() {

		List<Passanger> user = new ArrayList<Passanger>();
		passangerRepository.findAll().forEach(users -> user.add(users));
		return user;
	}

	public void addPassanger(Passanger Passanger) {
		passangerRepository.save(Passanger);
	}

	public Passanger updateFlight(int id) {
		return passangerRepository.findById(id);
	}

	public void addBook(Passanger flight) {
		passangerRepository.save(flight);
	}

	public List<Passanger> getAllFlight() {
		return (List<Passanger>) passangerRepository.findAll();
	}

}
