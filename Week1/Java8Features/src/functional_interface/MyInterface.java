package functional_interface;

@FunctionalInterface
public interface MyInterface {
	
	public abstract int add(int a , int b) ;//function functional interface
	
	default void show1() {
		System.out.println("with def ");
	}
	
	static void show2() {
		System.out.println("with static");
	}

}
