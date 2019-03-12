// Singleton: private static final instance
// private constructor
// static method of getting instance
// implements Cloneable and override clone method


public class Cat implements Cloneable{
	
	private static final Cat c = new Cat();
	
	private Cat() {};  // private constructor so no one can create a new instance
	
	public static Cat getInstance() {
		return c;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return c;
	}
}
