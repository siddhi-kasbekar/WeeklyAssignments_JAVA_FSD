package com.hexaware.admindashboard;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import com.hexaware.admindashboard.model.Restaurant;
import com.hexaware.admindashboard.service.IRestaurantService;
import com.hexaware.admindashboard.service.RestaurantServiceImpl;



public class App 
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {


		IRestaurantService service = new RestaurantServiceImpl();
		
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
				Serializable ser = service.insertRestaurant(restaurant);
				if (ser != null) {
				    System.out.println("Record inserted  ");
				} else {
				    System.err.println("Insert failed");
				}

				break;

			case 2:
				Restaurant res = readData();
				Serializable generatedId1 = service.updateRestaurant(res);
				if (generatedId1 != null) {
				    System.out.println("Record updated ");
				} else {
				    System.err.println("update failed");
				}


				break;

			case 3:
				System.out.println("Enter ID of record to be deleted ");
				int resId = scanner.nextInt();

				boolean isDeleted = service.deleteRestaurantById(resId);

				if (isDeleted) {
				    System.out.println("Record deleted successfully");
				} else {
				    System.err.println("Deletion failed. Record not found or an error occurred.");
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

		System.out.println("Enter ID (leave 0 for a new record):");
	    int id = scanner.nextInt();
	    restaurant.setResId(id);
	    
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
