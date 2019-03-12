package SingletonPattern;

public class Cat {
	
	// will only have one object in this class
	static Cat myCat = new Cat();
	
	public static Cat getInstance() {
		return myCat;
	}	
}
