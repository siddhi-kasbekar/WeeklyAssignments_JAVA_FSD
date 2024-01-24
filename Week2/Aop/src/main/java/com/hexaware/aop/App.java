package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop.config.AppConfig;
import com.hexaware.aop.exception.InsufficientFundsException;
import com.hexaware.aop.services.BankService;


public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	BankService service = context.getBean(BankService.class);
    	
    	service.login();

    	service.deposit();
    	
    	try {
			service.checkBalance(0);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
    	

    }
}
