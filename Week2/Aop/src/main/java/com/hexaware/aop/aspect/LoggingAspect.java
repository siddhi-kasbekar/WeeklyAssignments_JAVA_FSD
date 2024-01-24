package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hexaware.aop.exception.InsufficientFundsException;

@Component
@Aspect
public class LoggingAspect {
	
	@Before("execution( * com.hexaware.aop.services.*.*())")
	public void beforeLogs() {
		System.out.println("logs before any service");
	}
	
	@Pointcut("execution( * com.hexaware.aop.services.BankService.checkBalance(..))")
	public void afterReturningPointCut() {// point cut
		
	}
	
	@AfterReturning(pointcut = "afterReturningPointCut()", returning = "balance")
	public void afterReturningBalance(int balance) {
		System.out.println("logs after returning bal amount"+balance);
		
	}
	
	@AfterThrowing(pointcut ="afterReturningPointCut()", throwing = "e")
	public void afterThrowingExcep(InsufficientFundsException e) {
		System.out.println(e);
		
	}

}
