package synchronize;

public class Admissions implements Runnable {
	int seats = 1;
	public static void main(String[] args) {
		Runnable ad = new Admissions();
		
		Thread t1 = new Thread(ad,"Ron");
		Thread t2 = new Thread(ad, "Harry");
		
		t1.start();
		t2.start();
		
		
	}

	@Override
	public synchronized void run() {
		System.out.println("Seats available "+seats);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(seats > 0) {
			System.out.println("seat allocated to "+Thread.currentThread().getName());
			seats--;
		}
		else {
			System.out.println("try next year");
		}
		System.out.println("no. of seats left "+seats);
		
	}

}
