package com.elina.restproj;

import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
	
	
	@POST   // can create new resource but not update
	@Path("newStudent")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student createStudent(Student s) {
		data.create(s);
		
		if (s != null) {
			return s;
		} else {
			return null;
		}
	}
	
	
	@PUT  // can update an existing data, 
		  // or create a new student if there's no existing record
	@Path("updateStudent")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student updateStudent(Student s) {
		if (data.getStudentByName(s.getName()) != null) {
			data.update(s);
		} else {
			data.create(s);
		}	
		
		return s;
	}
	
	
	@DELETE
	@Path("deleteStudent/{name}")
	public void deleteStudent(@PathParam("name") String name) {
		if (data.getStudentByName(name) != null) {
			data.delete(name);
		} else {
			System.out.println("Delete failed: no such student");
		}
	}
	

}
