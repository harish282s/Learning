package com.example.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.boot.dao.StudentRepo;
import com.example.boot.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String student()
	{
		return "student.jsp";
	}

//	@RequestMapping("/addStudent")
//	public String addStudent(Student stud)
//	{
//		repo.save(stud);
//		return "student.jsp";
//	}
	
	//Rest post request
//	@PostMapping("/student")
//	public Student addStudent(Student stud)
//	{
//		repo.save(stud);
//		return stud;
//	}
	
	//If we use raw data in Postman while posting request,we will have to use @RequestBody annotation
	//and in post we will have to select JSON
	@PostMapping(path="/student",consumes="application/xml")
	public Student addStudent(@RequestBody Student stud)
	{
		repo.save(stud);
		return stud;
	}

//	@RequestMapping("/getStudent")
//	public ModelAndView getStudent(@RequestParam int sid)
//	{
//		ModelAndView mv =new ModelAndView("info.jsp");
//		Student stud =repo.findById(sid).orElse(new Student());//orElse to return null values if specific value is not found
//		
//		//JPA creates query automatically
//		System.out.println(repo.findBySname("Harish"));//find by name should be camel case
//		System.out.println(repo.findBySidGreaterThan(101));
//		System.out.println(repo.findBySnameSorted("Kasthuri"));
//		mv.addObject(stud);
//		
//		return mv;
//	}
	
	//Rest Api impl
//	@RequestMapping("/students")
//	@ResponseBody
//	public String getStudents()
//	{
//		//convert list to string
//		return repo.findAll().toString();
//	}
	
	//we can use GetMapping(similar to GET) for RestApi GET method and we can avoid @ResponseBody annotation by making @controller
	//as @RestController
	//@RequestMapping(path="/students",produces= {"application/xml","application/json"})
	//@ResponseBody
	@GetMapping
	public List<Student> getStudents()
	{
		//convert list to string
		return repo.findAll();
	}
	
	@RequestMapping("/student/101")
	//@ResponseBody
	public String getStudent()
	{
		
		return repo.findById(101).toString();
	}
	
	
//	
//	@RequestMapping("/student/{sid}")
//	@ResponseBody
//	public String getStudents(@PathVariable("sid")int sid)
//	{
//		
//		return repo.findById(sid).toString();
//	}
	@RequestMapping("/student/{sid}")
	//@ResponseBody
	public Optional<Student> getStudents(@PathVariable("sid")int sid)
	{
		
		return repo.findById(sid);
	}

	@DeleteMapping("/student/{sid}")
	public String deleteStudent(@PathVariable int sid)
	{
		
	 Student a=repo.getOne(sid);
	 repo.delete(a);
	 return "deleted";
	}
	
	@PutMapping(path="/student")
	public Student updateStudent(@RequestBody Student stud)
	{
		repo.save(stud);
		return stud;
	}
}

