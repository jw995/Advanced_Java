package com.elina.HibernateMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="laptop_table")
public class Laptop {
	
	@Id
	private int id;
	private String name;
	
	@ManyToMany
	private List<Student> student = new ArrayList<Student>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", student=" + student + "]";
	}

	

}
