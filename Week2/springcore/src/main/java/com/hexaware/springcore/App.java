package com.hexaware.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springcore.entities.Employee;
import com.hexaware.springcore.services.IService;
import com.hexaware.springcore.services.ServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//    	Address addr = context.getBean(Address.class);
//    	addr.setCity("Noida");
    	Employee e1 = context.getBean("emp",Employee.class);
    	e1.setEid(101);
    	e1.setEname("sid");
    	//e1.setAddr(addr);
    	
    	System.out.println(e1);
    	
    	IService service = context.getBean(ServiceImpl.class);
    	
    	service.getService();
    	
    }
}
