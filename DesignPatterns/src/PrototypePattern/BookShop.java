package PrototypePattern;

import java.util.ArrayList;
import java.util.List;


//cloneable is a mark interface (with no data or methods)
public class BookShop implements Cloneable {
	private String name;
	List<Book> books = new ArrayList<>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	// add data from database
	public void loadData() {
		for (int i = 0; i < 10; i++) {
			Book b = new Book();
			b.setBookId(i);
			b.setBookName("Book" + i);
			getBooks().add(b); 
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [name=" + name + ", books=" + books + "]";
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bs = new BookShop();
		
		for (Book b : this.getBooks()) {
			bs.getBooks().add(b);
		}
		return bs;
	}	
	

}
