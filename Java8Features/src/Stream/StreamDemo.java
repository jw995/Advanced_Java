package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// step 1: generate stream: collection.stream()  collection.parallelStream()
// step 2: many intermediate operations 
// step 3: one terminate operation 


// ordering rule: intermediate operations which reduce the size of the stream 
// should be placed before operations which are applying to each element. 
// So, keep such methods as skip(), filter(), distinct() at the top of your stream pipeline.

public class StreamDemo {
	
	public static void main(String[] args) {
		
		// skip, map
		System.out.println("Map: ");
		Stream.of("Helen", "Jinna", "Cameron").skip(1).map(e -> e + " gogogo")
				  .forEachOrdered(System.out::println);
		
		
		List<Person> list=Arrays.asList(
				new Person(1,"Sara","F",20),
				new Person(2,"Sara","F",27),
				new Person(3,"Bob","M",20),
				new Person(4,"Paula","F",32),
				new Person(5,"Paul","M",32),
				new Person(6,"Jack","M",22),
				new Person(7,"Jack","M",72),
				new Person(8,"Jill","F",12));
		
		
		// filter, collect, for each
		System.out.println("Female: ");
		list.stream().filter(person -> person.getGender().equals("F"))
		.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Elder than 25: ");
		list.stream().filter(person -> person.getAge() > 25)
		.collect(Collectors.toList()).forEach(p -> System.out.println(p));
		
		System.out.println("Female elder than 25: ");
		list.stream().filter(person -> person.getGender().equals("F"))
		.filter(p -> p.getAge() > 25)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

}
