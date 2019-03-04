package com.elina;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	
	@Autowired
	StudentDAO data;
	
	// no need to specify xml or json format. Jackson will automatically convert xml into json format
	// only need to use the findAll method in crudRepository interface and it will return all the data in database.
	@GetMapping("students")
	public List<Student> getStudents() {
		List<Student> students = (List<Student>) data.findAll();
		return students;
	}

}
