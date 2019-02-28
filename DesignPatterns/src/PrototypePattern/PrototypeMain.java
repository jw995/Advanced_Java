package PrototypePattern;


// Prototype can create multiple instances of a class
// Prototype design pattern adv:
// fetching data from old object instead of fetching from database.
// it is much faster
public class PrototypeMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs = new BookShop();		
		bs.setName("Novelty");
		bs.loadData();		
		System.out.println(bs);
		
		// BookShop bs1 = new BookShop();
		BookShop bs1 = bs.clone();
		bs1.setName("Colomod");
		// if we do this, the program have to go to the database and then fetch the data.
		// how about ask bs to give all his data to bs1, which means ask a copy from bs 
		// bs1.loadData();
		System.out.println(bs1);

		
	}
	
	
	

}
