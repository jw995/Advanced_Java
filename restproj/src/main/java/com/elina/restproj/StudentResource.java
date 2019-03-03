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
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})  // content negotiation
	public List<Student> getStudents() {
		System.out.println("getting data from mysql database...");
		if(data.getStudents() != null) {
			return data.getStudents();
		} else {
			return null;
		}
	}
	
	@GET
	@Path("student/{stdname}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student getStudent(@PathParam("stdname") String stdname) {
		System.out.println("getting a pecific student " + stdname);
		if (data.getStudentByName(stdname) != null) {
			return data.getStudentByName(stdname);
		} else {
			return null;
		}
	}
	
	
	@POST
	@Path("newStudent")
	public Student createStudent(Student s) {
		data.create(s);
		
		return s;
	}

}
