package com.elina.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	StudentName stName = new StudentName();
    	stName.setFirstName("Elissa");
    	stName.setMiddleName("Lirrr");
    	stName.setLastName("Brown");
    	
    	
    	Student st = new Student();
        st.setId(102);;
        st.setName(stName);
        st.setPoints(68);
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = config.buildSessionFactory();   
        
        Session ss = sf.openSession();
        
        Transaction tx = ss.beginTransaction();    
        
        ss.save(st);
        Student s = (Student)ss.get(Student.class, 102);
        
        tx.commit();
                
        
        System.out.println(s);
    }
}
