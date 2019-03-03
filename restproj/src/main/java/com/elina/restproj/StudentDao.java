package com.elina.restproj;

import java.util.ArrayList;
import java.util.List;

// this class will work with database
public class StudentDao {
	List<Student> students;
	
	public StudentDao() {
		students = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setName("Jay");
		s1.setPoints(45);
		
		Student s2 = new Student();
		s2.setName("Smith");
		s2.setPoints(78);
		
		students.add(s1);
		students.add(s2);
	}
	
	
	public List<Student> getStudents() {
		return students;
	}
	
	
	public Student getStudentByName(String name) {		
		for (Student s : students) {
			if (s.getName().equals(name)) {
				return s;
			}
		}
		System.out.println("no such student");
		return null;
	}


	public void create(Student s) {
		// TODO Auto-generated method stub
		students.add(s);
	}

}
