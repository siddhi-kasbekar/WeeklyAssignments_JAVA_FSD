package threads;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		// System.out.println("calling run()");
		for (int i = 0; i <= 5; i++) {
			System.out.println("child thread");

		}

	}

	public static void main(String[] args) {
//		System.out.println("main method");
		ThreadDemo td1 = new ThreadDemo();
		//System.out.println(td1);// [threadname, priority(1-10),group name]
		td1.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("main");

		}

	}

}
