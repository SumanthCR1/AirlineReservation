package com.digisprint.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
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
	Passangerrepository passrepo;
	int id;
	String firstname, contactaddress, emailid, phonenumber;
	
	public boolean validate( HttpServletRequest request) throws SQLException {
		System.out.println("Comming into in");
		Passanger user;
		System.out.println("1st line");
        firstname= request.getParameter("firstname");
         String password=request.getParameter("password");
        
        System.out.println("2nd line");
        System.out.println(firstname);
        System.out.println(password);
        user= loginrepository.findByFirstnameAndPassword(firstname, password);
        boolean res;
        try {
    	  res=(user.getFirstname().equals(firstname)&&user.getPassword().equals(password));
     }catch(Exception e) {
    	 throw e;
     }
        if(res==true)
        {
        	System.out.println("True");
            return true;
        }
        else {
        	System.out.println("False");
            return false;
        }

	}
	public String getFirstName(Passanger pass) {
		pass.getEmailid();
		
		System.out.println(firstname+ emailid+ contactaddress);
		
		
		return firstname+emailid+phonenumber+contactaddress;
		
	}
	public Passanger getdata(String firstname)
	{	
	   Passanger pass= passrepo.findByfirstname(firstname);
	   return pass;
	}
	
	
}
