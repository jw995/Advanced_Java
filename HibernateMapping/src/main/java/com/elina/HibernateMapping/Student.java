package com.elina.HibernateMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="student_table")  // define a different table name
public class Student {
	
	private int Id;
	private String name;
	
	@Transient             // data wont be stored in mySQL
	@Column(name="marks")  // define a different column name 
	private int points;
	
	@ManyToMany(mappedBy="student", fetch=FetchType.EAGER)   // the field name in laptop class where it is mapping to
	private List<Laptop> lp = new ArrayList<Laptop>();  
	
	@Id
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}	
	
	@ManyToMany(mappedBy="student")
	public List<Laptop> getLp() {
		return lp;
	}
	
	@ManyToMany(mappedBy="student")
	public void setLp(List<Laptop> lp) {
		this.lp = lp;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", points=" + points + ", lp=" + lp + "]";
	}
}
