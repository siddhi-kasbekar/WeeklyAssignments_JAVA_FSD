package datetime;
import java.time.LocalDate;

public class DateAPIs {
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println(date1.plusMonths(3));
		System.out.println(date1.isLeapYear());
		System.out.println(date1.minusYears(20));
		System.out.println(date1.getYear());
		System.out.println(date1.getDayOfYear());
	}


}
