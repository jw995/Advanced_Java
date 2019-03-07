package com.elina.HibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Laptop lappy = new Laptop();
        lappy.setId(1);
        lappy.setName("Dell");
        
        Student st = new Student();
        st.setName("Emily");
        st.setId(101);
        st.setPoints(90);
        
        st.getLp().add(lappy);
        lappy.getStudent().add(st);
        
        Configuration config = new Configuration().configure()
        		.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        
        SessionFactory sf = config.buildSessionFactory();   
        
        Session ss = sf.openSession();
        
        Transaction tx = ss.beginTransaction();    
        
        ss.save(lappy);
        ss.save(st);
        Student s = (Student)ss.get(Student.class, 101);
        
        tx.commit();                
        
        
    }
}
