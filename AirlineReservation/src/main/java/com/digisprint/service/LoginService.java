package com.digisprint.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digisprint.model.Passanger;
import com.digisprint.repository.Flightrepository;
import com.digisprint.repository.Loginrepository;

@Component
@Service
public class LoginService {

	@Autowired
	Flightrepository flightrepository;
	
	@Autowired
	Loginrepository loginrepository;
	
	public boolean validate(HttpServletRequest request) throws SQLException {
		System.out.println("Comming into in");
		Passanger user= new Passanger();
		System.out.println("1st line");
        String firstname= request.getParameter("firstname");
        String password=request.getParameter("password");
        System.out.println("2nd line");
        System.out.println(firstname);
        System.out.println(password);
        user= loginrepository.findByFirstnameAndPassword(firstname, password);
        if(user.getFirstname().equals(firstname)&&user.getPassword().equals(password))
        {
        	System.out.println("True");
            return true;
        }
        else {
        	System.out.println("False");
            return false;
        }

	}
}
