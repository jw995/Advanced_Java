package Jiayi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
    public static void main(String[] args) {
        // Triangle tr = new Triangle();
        ApplicationContext factory = new ClassPathXmlApplicationContext("file:src/spring.xml");
        Triangle tr = (Triangle) factory.getBean("triangle");
        tr.draw();
    }
}
