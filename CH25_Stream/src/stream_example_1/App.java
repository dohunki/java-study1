package stream_example_1;

import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(2);
		numbers.add(4);
		
		numbers.stream().forEach(System.out::println);
		
		System.out.println();		
		numbers.stream().forEach(n -> System.out.println(n));
		
		System.out.println();
		numbers.stream()
			.filter(n -> n > 5)
			.map(n -> n * n)
			.forEach(System.out::println);
	}

}
