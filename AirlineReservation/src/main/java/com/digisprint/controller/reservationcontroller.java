package com.digisprint.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Component

public class reservationcontroller {

	@GetMapping("/confirming")
	public String flightconfirm() {
		return "Confirmdata";
		
	}
	@GetMapping("/Checkout")
	public String check(@RequestParam("num") int num, @RequestParam("price") int price, HttpServletRequest request, ModelMap map) {
		System.out.println(num);
		//int n=Integer.parseInt(request.getParameter("price"));
		int total=num*price;
		map.put("Total", total);
		return "Confirmpayment";
	}
	
	@GetMapping("Afterpayment")
	public String aftercheck() {
		
		
		return null;
		
	}
}
