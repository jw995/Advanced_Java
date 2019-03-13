package DeadLock;

//This class is shared by both threads 
public class Shared {
	public synchronized void test1(Shared obj) throws InterruptedException {
		System.out.println("test1-begin"); 
		Thread.sleep(1000); 
	        
		obj.test1(this);
		System.out.println("test1-end"); 
	} 
	
	public synchronized void test2(Shared obj) throws InterruptedException {
		System.out.println("test2-begin"); 
		Thread.sleep(1000); 
		
		obj.test2(this);
		System.out.println("test2-end"); 
	}


	

}
