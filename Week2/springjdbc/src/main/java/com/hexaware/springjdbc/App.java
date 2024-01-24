package com.hexaware.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.model.Customer;
import com.hexaware.springjdbc.service.CustomerServiceImpl;
import com.hexaware.springjdbc.service.ICustomerService;

/**
 * Hello world!
 *
 */
public class App {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ICustomerService service = context.getBean(CustomerServiceImpl.class);

		boolean flag = true;

		while (flag) {
			System.out.println("****WELCOME DMS ***");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SELECT BY ID");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				Customer customer = readData();
				boolean isInserted = service.insertCustomer(customer);
				if (isInserted) {
					System.out.println("record inserted ");
				} else {
					System.err.println("insert failed");
				}

				break;

			case 2:
				Customer cust = readData();
				boolean isUpdated = service.updateCustomer(cust);
				if (isUpdated) {
					System.out.println("record updated ");
				} else {
					System.err.println("update failed");
				}

				break;

			case 3:
				System.out.println("Enter ID of record to be deleted ");

				int cid = scanner.nextInt();
				
				boolean isDeleted = service.deleteCustomerById(cid);
				if (isDeleted) {
					System.out.println("record deleted ");
				} else {
					System.err.println("deletion failed");
				}

				break;

			case 4:
				System.out.println("Enter ID  ");

				int cid1 = scanner.nextInt();
				
				Customer customer1 = service.selectCustomerById(cid1);
				
				if (customer1 != null) {
					System.out.println(customer1);
				} else {
					//implement customerNotFounf exception
					System.err.println("record not found");
				}

				

				break;

			case 5:
				
				List<Customer> list = service.selectAll();
				for (Customer customer2 : list) {
					System.out.println(customer2);
					
				}

				break;

			case 6:
				System.out.println("Thank you!! visit again");
				flag = false;

				break;

			default:
				break;
			}

		}

	}

	public static Customer readData() {

		Customer customer = new Customer();

		System.out.println("enter id");
		customer.setCustomerId(scanner.nextInt());
		System.out.println("enter name");
		customer.setCustomerName(scanner.next());
		System.out.println("enter age");
		customer.setAge(scanner.nextInt());

		return customer;
	}

}
