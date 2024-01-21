package streamapi;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String[] args) {
		
		Stream stream = Stream.of(10,30,5,60);
		//long count = stream.count();
		//System.out.println(count);
		
		
		Comparator comparator = (i1, i2)->{return i1.toString().compareTo(i2.toString());};
		Optional<Integer> opt = stream.max(comparator);
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		else {
			System.out.println(opt.orElse(0));
		}
		
		
		String names[] = {"ron","harry","hormoine"};
		Stream<String> stream2 = Arrays.stream(names);
		
		stream2.map((str)->{return str.length();})
		.forEach((len)->{System.out.println(len);});
		
		List list = Arrays.asList(names);
		Stream<String> stream3 = list.stream();
		
		stream.map((str1)->{return ( str1.length();})
				.filter((len1)->{return len1 > 7;})
					.forEach(System.out::println);//method reference
		

		
	}

}
