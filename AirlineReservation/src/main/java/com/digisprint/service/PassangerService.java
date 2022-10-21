package com.digisprint.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
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
			@RequestParam("emailid")String emailid, ModelMap modelMap) {

	
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
	this.passangerrepository.save(user);
	
	
	modelMap.put("id",user.getId());
	modelMap.put("firstname",firstname);
	modelMap.put("lastname", lastname);
	modelMap.put("age", age);
	modelMap.put("gender", gender);
	modelMap.put("phonenumber", phonenumber);
	modelMap.put("contactaddress", contactaddress);
	modelMap.put("emailid", emailid);
	
return "viewpassanger";

	}
}
