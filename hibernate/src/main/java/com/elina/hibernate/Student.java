package com.elina.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="studentData")  // define a different table name
public class Student {
	
	private int Id;
	private StudentName name;
	
	@Transient             // data wont be stored in mySQL
	@Column(name="marks")  // define a different column name 
	private int points;
	
	@Id
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	public StudentName getName() {
		return name;
	}
	public void setName(StudentName name) {
		this.name = name;
	}
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", points=" + points + "]";
	}
}
