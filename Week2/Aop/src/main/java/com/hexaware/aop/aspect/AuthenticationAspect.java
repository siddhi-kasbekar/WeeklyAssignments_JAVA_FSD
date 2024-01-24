package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {
	@Pointcut("execution( * com.hexaware.aop.services.BankService.login())")
	
	public void authenticate() {// pointcut 1
		
	}
	
	@Pointcut("execution( * com.hexaware.aop.services.BankService.*())")
	public void authorization() {// pointcut 2
		
	}
	
	
	@Before("authenticate() || authorization()") //join point
	public void authenticateAuthorize() {
		System.out.println("login success and authorized user ");
		
	}


}
