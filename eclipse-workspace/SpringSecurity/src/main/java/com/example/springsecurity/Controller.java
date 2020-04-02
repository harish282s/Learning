package com.example.springsecurity;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String home() 
	{
		
		System.out.println("In  Controller");
		return "home.jsp";
	}

}
