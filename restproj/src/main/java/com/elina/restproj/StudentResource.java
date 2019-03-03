package com.elina.restproj;

import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	
	StudentDao data = new StudentDao();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getStudents() {
		System.out.println("getting data from resource file...");
		return data.getStudents();
	}
	
	@GET
	@Path("student/{name}")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(@PathParam("name") String name) {
		System.out.println("getting a pecific student " + name);
		return data.getStudentByName(name);
	}
	
	
	@POST
	@Path("newStudent")
	public Student createStudent(Student s) {
		System.out.println(s);
		data.create(s);
		
		return s;
	}

}
