package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
//	@RequestMapping("app") 
//	public String home(HttpServletRequest req)
//	{
//		//Req dispatcher is used internally to redirect to jsp, hence no change in url
//		HttpSession session =req.getSession();
//		String name =req.getParameter("name");
//		System.out.println("Boot webapp "+ name);
//		session.setAttribute("name", name);
//		 return "Home";
//	}
	
//	@RequestMapping("app") 
//	//@RequestParam -which gets value from query and assigns to variable(name -->myname)
//	public String home(@RequestParam("name") String myname,HttpSession session)
//	{
//		//using spring MVC,we can eliminate he unwanted codes and get values from query instead of using httpservlet
//		
//		System.out.println("Boot webapp "+ myname);
//		session.setAttribute("name", myname);
//		 return "Home";
//	}
//	
	
	//Using Model and View(Spring),hence session is not required
	@RequestMapping("app") 
	//@RequestParam -which gets value from query and assigns to variable(name -->myname)
//	public ModelAndView home(@RequestParam("name") String myname)
//	{
//		
//		ModelAndView mv =new ModelAndView();
//		mv.addObject("name",myname);
//		mv.setViewName("Home");
//		return mv;
//	}
//	
	//Passing query values as obj
	public ModelAndView home(Student stud)
	{
		
		ModelAndView mv =new ModelAndView();
		mv.addObject("obj",stud);
		mv.setViewName("Home");
		return mv;
	}


}
