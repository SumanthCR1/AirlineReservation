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
import com.digisprint.repository.Flightrepository;
import com.digisprint.repository.Loginrepository;
import com.digisprint.repository.Passangerrepository;

@Component
@Service
public class LoginService {

	@Autowired
	Flightrepository flightrepository;
	
	@Autowired
	Loginrepository loginrepository;
	@Autowired
	Passangerrepository passangerrepository;
	int id;
	String firstname, contactaddress, emailid, phonenumber, age;
	
	public boolean validate( HttpServletRequest request) throws SQLException {
		
		Passanger user;
		System.out.println("1st line");
        firstname= request.getParameter("firstname");
         String password=request.getParameter("password");
        
        System.out.println("2nd line");
        System.out.println(firstname);
        System.out.println(password);
        user= loginrepository.findByFirstnameAndPassword(firstname, password);
        boolean res;
      
    	  res=(user.getFirstname().equals(firstname)&&user.getPassword().equals(password));
    
        if(res==true)
        {
        	age=user.getGender();
        	emailid=user.getEmailid();
        	phonenumber=user.getPhonenumber();
        	System.out.println("True");
            return true;
        }
        else {
        	System.out.println("False");
            return false;
        }
	}

	public Passanger getdata(String firstname)
	{	
	   Passanger passanger= passangerrepository.findByfirstname(firstname);
	   return passanger;
	}
	public ModelMap getreservation(ModelMap map) {

		map.put("firstname", firstname );
		map.put("emailid", emailid );
		map.put("phonenumber", phonenumber );
		return map;
	
	}
	
}
