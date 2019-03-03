package com.elina.restproj;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

// this class will work with database

// notice: maven dependency use mysql connector 8.0.13 version, or any version 8.0.x
//		   or it will cause a nullpointer exception

// 		   use Class.forName("com.mysql.jdbc.Driver") to specify a driver

public class StudentDao {

	Connection conn;
	
	public StudentDao() {
		String url = "jdbc:mysql://localhost:3306/users";
		String username = "jiayi";
		String password = "hello";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		String sql = "select * from restdata";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Student s = new Student();
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
				s.setName(rs.getString(1));
				s.setPoints(rs.getInt(2));
				
				students.add(s);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		return students;
	}
	
	
	public Student getStudentByName(String stdname) {		
		// don't forget the "" for strings in the clause
		String sql = "select * from restdata where name = '" + stdname + "'";
		Student s = new Student();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				s.setName(rs.getString(1));
				s.setPoints(rs.getInt(2));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		return s;
	}


	public void create(Student s) {
		// TODO Auto-generated method stub
		String sql = "insert into restdata values(?,?)";
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, s.getName());
			st.setInt(2, s.getPoints());
			st.executeUpdate();
			System.out.println("Created a new student: " + s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
