package pojo;

public class Test {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"sid",50000);
		System.out.println(emp1);
		
		Employee emp2 = new Employee();
		emp2.setEid(102);
		System.out.println(emp2.getEid());
		System.out.println(emp2);
	}

}
