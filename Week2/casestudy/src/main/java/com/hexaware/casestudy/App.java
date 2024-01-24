package com.hexaware.casestudy;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.casestudy.config.AppConfig;
import com.hexaware.casestudy.model.Restaurant;
import com.hexaware.casestudy.service.IRestaurantService;
import com.hexaware.casestudy.service.RestaurantServiceImpl;


/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IRestaurantService service = context.getBean(RestaurantServiceImpl.class);

		boolean flag = true;

		while (flag) {
			System.out.println("****WELCOME to  RMS ***");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. search by location");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				Restaurant restaurant = readData();
				boolean isInserted = service.insertRestaurant(restaurant);
				if (isInserted) {
					System.out.println("record inserted ");
				} else {
					System.err.println("insert failed");
				}

				break;

			case 2:
				Restaurant res = readData();
				boolean isUpdated = service.updateRestaurant(res);
				if (isUpdated) {
					System.out.println("record updated ");
				} else {
					System.err.println("update failed");
				}

				break;

			case 3:
				System.out.println("Enter ID of record to be deleted ");

				int resId = scanner.nextInt();
				
				boolean isDeleted = service.deleteRestaurantById(resId);
				if (isDeleted) {
					System.out.println("record deleted ");
				} else {
					System.err.println("deletion failed");
				}

				break;

			case 4:
				System.out.println("Enter location  ");

				String location = scanner.next();
				
				List<Restaurant> list1 = service.selectRestaurantByLocation(location);
				
				for (Restaurant res2 : list1) {
					System.out.println(res2);
					
				}

				

				break;

			case 5:
				
				List<Restaurant> list = service.selectAll();
				for (Restaurant res2 : list) {
					System.out.println(res2);
					
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

	public static Restaurant readData() {

		Restaurant restaurant = new Restaurant();

		
		System.out.println("enter name");
		restaurant.setResName(scanner.next());
		System.out.println("enter location");
		restaurant.setLocation(scanner.next());
		System.out.println("contact number");
		restaurant.setContactNo(scanner.next());
		System.out.println("Rating");
		restaurant.setRating(scanner.nextBigDecimal());

		return restaurant;
	}

}
