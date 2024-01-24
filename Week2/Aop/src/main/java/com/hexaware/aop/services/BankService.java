package com.hexaware.aop.services;

import org.springframework.stereotype.Service;

import com.hexaware.aop.exception.InsufficientFundsException;

@Service
public class BankService {
	
	public void deposit() {
		System.out.println("amount deposited..");
	}

	
	public void withdraw() {
		System.out.println("amount withdrawn");
	}
	
	public void fundtransfer() {
		System.out.println("funds tranferred ");
	}
	
	public int checkBalance(int acno) throws InsufficientFundsException {
		
		int balance = 0;
		if(acno>0) {
			balance = 50000;
		}
		else {
			throw new InsufficientFundsException();
			
			
		}
		return balance;


	}
	
	public void login() {
		System.out.println("login successful");
	}
}
