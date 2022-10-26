package com.digisprint.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digisprint.model.Passanger;
import com.digisprint.repository.Flightrepository;
import com.digisprint.repository.Loginrepository;
import com.digisprint.repository.adminrepository;

@Component
@Service
public class adminService {

	

	@Autowired
	Flightrepository flightrepository;
	
	@Autowired
	adminrepository adminrepo;

	public boolean validate(HttpServletRequest request) {
		System.out.println("Comming in");
		
        String username= request.getParameter("username");
        String adminpassword=request.getParameter("adminpassword");
       
        if(username.equals("Admin")&&adminpassword.equals("123"))
        {
            return true;
        }
        else
            return false;
		
	
}
	}
