package SingletonPattern;

public class SingletonMain {
	
	public static void main(String[] args) {
		Cat cat1 = Cat.getInstance();
		Cat cat2 = Cat.getInstance();
		
		// prints out same object
		System.out.println(cat1);
		System.out.println(cat2);
	} 

}
