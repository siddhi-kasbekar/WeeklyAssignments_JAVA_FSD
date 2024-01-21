package functional_interface;

public class MyImp7 implements MyInterface{

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MyInterface mi1 = new MyImp7();
		mi1.add(3, 9);
		
	}

}
