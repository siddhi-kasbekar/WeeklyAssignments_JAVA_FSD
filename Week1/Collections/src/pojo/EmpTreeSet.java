package pojo;

import java.util.HashSet;
import java.util.Set;

public class EmpTreeSet {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee(101,"sid",50000));
		set.add(new Employee(101,"tom",50000));//rejected
		System.out.println(set);

		
	}

}
