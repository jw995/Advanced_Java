package FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Lambda.Emp;

// java.utl.Functions
public class Demo {
	
	private static List<Emp> personList = Arrays.asList(			
			new Emp(1,"Sara","F",20),
			new Emp(2,"Sara","F",27),
			new Emp(3,"Bob","M",20),
			new Emp(4,"Paula","F",32),
			new Emp(5,"Paul","M",32),
			new Emp(6,"Jack","M",22),
			new Emp(7,"Jack","M",72),
			new Emp(8,"Jill","F",12));
	

	
	private static void printConditionally(Predicate<Emp> predicate, Consumer<Emp> consumer) {
		
		System.out.println("printing elements conditionally: ");
		for (Emp ps : personList) {
			if (predicate.test(ps)) {
				consumer.accept(ps);
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		// 1. sort by name
		Collections.sort(personList, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		
		// 2. create a method that prints all elements in the list
		printConditionally(p -> true, p -> System.out.println(p));
		
		// 3. create a methods that finds of all the names begins with J
		printConditionally(p -> p.getName().startsWith("J"), p -> System.out.println(p));
		
	}

}
