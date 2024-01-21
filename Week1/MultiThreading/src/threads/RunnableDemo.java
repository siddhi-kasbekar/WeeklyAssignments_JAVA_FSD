package threads;

public class RunnableDemo implements Runnable {
	
	public static void main(String[] args) {
		Runnable t1 = new RunnableDemo();//but now start method isn't there in runnable
		
		Thread td = new Thread(t1, "child");
		System.out.println(td);
		td.start();
	}

	@Override
	public void run() {
		System.out.println("run() is called");

		
	}

}
