package Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


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
	
	
	private static void printAll() {
		System.out.println("printing all elements: ");
		for (Emp p : personList) {
			System.out.println(p);
		}
	}
	
	private static void printConditionally(Condition con) {
		
		System.out.println("printing elements conditionally: ");
		// TODO Auto-generated method stub
		for (Emp ps : personList) {
			if (con.test(ps)) {
				System.out.println(ps);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		// 1. sort by name
		Collections.sort(personList, new Comparator<Emp>() {
			@Override
			public int compare(Emp p1, Emp p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		// 2. create a method that prints all elements in the list
		printAll();
		
		// 3. create a methods that finds of all the names begins with C
		printConditionally(new Condition() {
			@Override
			public boolean test(Emp e) {
				return e.getName().startsWith("J");			
			}
		});		
		
		
	}
}
