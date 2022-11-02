package com.digisprint.service;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadRootSmartSoapEndpointInterceptor;

import com.digisprint.model.Flight;
import com.digisprint.model.Passanger;
import com.digisprint.repository.Passangerrepository;
@Component
@Service
public class PassangerService {
	@Autowired
	Passangerrepository passangerrepository;
	
	public String details(
			@RequestParam("firstname") String firstname,
			@RequestParam("lastname")String lastname,
			@RequestParam("age") int age,
			@RequestParam("gender") String gender,
			@RequestParam("phonenumber") String phonenumber,
			@RequestParam("contactaddress")String contactaddress,
			@RequestParam("emailid")String emailid, 
			@RequestParam("password")String password,
			ModelMap modelMap) {

	
	Passanger user=new Passanger();
	

	user.setId(user.getId());
	user.setFirstname(firstname);
	user.setLastname(lastname);
	user.setAge(age);
	user.setGender(gender);
	user.setPhonenumber(phonenumber);
	user.setContactaddress(contactaddress);
	user.setEmailid(emailid);
	user.setEmailid(emailid);
	user.setPassword(password);
	this.passangerrepository.save(user);
	
	
	modelMap.put("id",user.getId());
	modelMap.put("firstname",firstname);
	modelMap.put("lastname", lastname);
	modelMap.put("age", age);
	modelMap.put("gender", gender);
	modelMap.put("phonenumber", phonenumber);
	modelMap.put("contactaddress", contactaddress);
	modelMap.put("emailid", emailid);
	modelMap.put("password", password);
	
return "viewpassanger";

	}
	

	public List<Passanger> userlist() {
		  
		  List<Passanger> user = new ArrayList<Passanger>();
		  passangerrepository.findAll().forEach(user1 -> user.add(user1));
		return user;
	
}
	
/*
 * 
 * public void addpassanger(Passanger Pass) { passangerrepository.save(Pass);
 * 
 * }
 * 
 * public Passanger update(HttpServletRequest request) { Passanger
 * passanger=passangerrepository.findById(Integer.parseInt(request.getParameter(
 * "id"))); passanger.setFirstname(request.getParameter("id"));
 * passangerrepository.save(passanger); return passanger; }
 */
	
	public Passanger UpdateFlight(int id) {
		return passangerrepository.findById(id);
	}
	
	public void addBook(Passanger flight) {
		passangerrepository.save(flight);
	}
	
	public List<Passanger> getAllFlight(){
		return (List<Passanger>) passangerrepository.findAll();
	}
	
	
	
}
