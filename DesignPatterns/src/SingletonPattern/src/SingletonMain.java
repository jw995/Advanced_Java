
public class SingletonMain {

	public static void main(String[] args) {
		Cat c1 = Cat.getInstance();
		Cat c2 = Cat.getInstance();
		System.out.println(c1);
		System.out.println(c2);
	}
}
