package presentation;

import java.util.List;
import java.util.Scanner;

import dao.DeptDaoImp;
import dao.IDepartmentDao;
import entity.Department;

public class Client {
	
  static	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {


		IDepartmentDao dao = new DeptDaoImp();
		
		boolean flag = true;
		
		
		
		while(flag) {
		System.out.println("****WELCOME DMS ***");
		System.out.println("1. INSERT");
		System.out.println("2. UPDATE");
		System.out.println("3. DELETE");
		System.out.println("4. SELECT BY ID");
		System.out.println("5. SELECT ALL");
		System.out.println("6. EXIT");
		
		
		int choice =	scanner.nextInt();
		
		
		
			switch (choice) {
			case 1:
				
				Department dept =	readData();
				
				int count =	dao.insertDept(dept);
				
				System.out.println(count +" record inserted successfully");
				
				break;
			
			case 2:
				Department dept1 = readData();
				int count1 = dao.updateDept(dept1);
				System.out.println(count1+" record updated successfully !!");
				break;
				
			case 3:
				System.out.println("Enter DNO of record to be deleted ");
				
				int dno =scanner.nextInt();				
				int count2 = dao.deleteOne(dno);
				System.out.println(count2+" record deleted");
				break;
				
				
			case 4:
				System.out.println("Enter dno:");
				int dno1 = scanner.nextInt();
				Department dept2 =  dao.selectDept(dno1);

				if (dept2 != null) {
				    System.out.println(dept2);
				} else {
				    System.out.println("No department found with the specified dno.");
				}
				break;
				
				
			case 5:
				List<Department> list =	  dao.selectAll();		
				
				
				list.stream().forEach(System.out::println);
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
	
	
	
	public static Department  readData() {
		
		
		System.out.println("Enter DNO");
		
		int dno =scanner.nextInt();
		
			scanner.nextLine();
		
		System.out.println("Enter DNAME");
		
		String dname = scanner.nextLine();
		
		System.out.println("Enter LOCATION");
		
		String location = scanner.nextLine();
		
		
		Department dept = new Department(dno,dname,location);
		
		return dept;
	}
	
	
	
	

}
