package datetime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Datetime {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now() ;
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2002, 2, 25);
		System.out.println(date2);
		String str = "1990-03-24";
		LocalDate date3 = LocalDate.parse(str);
		System.out.println(date3);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str2 = "20-04-2023";
		
		LocalDate date4 = LocalDate.parse(str2, dtf);
		System.out.println(date4);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String date5 = date1.format(formatter2);
		System.out.println(date5);
		
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//String myDate = 
		
		
		
		
		
		
		
		
		
	}

}
