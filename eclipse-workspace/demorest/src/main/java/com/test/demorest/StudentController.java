package com.test.demorest;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.persistence.annotations.DeleteAll;

@Path("students")
public class StudentController {

	StudentRepo repo = new StudentRepo();

	@GET
	@Produces(MediaType.APPLICATION_XML) // what kind of response is sent
	public List<Student> getStudents() {
//    	Student s =new Student ();
//		s.setName("Kasthuri");
//		s.setSid(101);
//		
//		
//		Student s1 =new Student ();
//		s1.setName("Harish");
//		s1.setSid(102);
//	
		// List<Student> stud =Arrays.asList(s,s1);

		// return stud;

		return repo.getStudents();
	}

	@POST
	@Path("/student")
	@Consumes(MediaType.APPLICATION_XML)
	public Student createStudent(Student st) {

		System.out.println(st);
		repo.create(st);
		return st;
	}

	@GET
	@Path("student/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Student getStudent(@javax.ws.rs.PathParam("id") int id) {

		return repo.getStudent(id);
	}

//	@GET
//	@Path("student/101")
//	@Produces(MediaType.APPLICATION_XML) 
//	public Student getStudent () {
//
//		return repo.getStudent(101);
//	}

	@PUT
	@Path("student")
	@Consumes(MediaType.APPLICATION_XML)
	public Student updateStudent(Student st) {

		System.out.println(st);
		repo.update(st);
		return st;
	}

	@DELETE
	@Path("student/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Student deleteStudent(@javax.ws.rs.PathParam("id") int id) {

		Student s = repo.getStudent(id);

		if (s.getSid() != 0)

			repo.delete(id);

		return s;
	}

}
