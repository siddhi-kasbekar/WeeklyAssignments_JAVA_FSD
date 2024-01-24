package com.springannotations.AnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springannotations.beans.Department;
import com.springannotations.beans.Employee;


@Configuration
@ComponentScan(basePackages = "com.springannotations")
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Employee emp = context.getBean(Employee.class);
        Department dept = context.getBean(Department.class);
        
       
       
       emp.setEid(100);
       emp.setEname("sid");
       
       dept.setDno(120);
       dept.setDname("R&D");
       dept.setLocation("Noida");
       System.out.println(emp);
       System.out.println(dept);
       
       
    }
}
