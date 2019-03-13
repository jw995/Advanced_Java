package DeadLock;

public class Test {
	
	public static void main(String[] args) {
		// creating one object 
	    Shared s1 = new Shared(); 

	    // creating second object 
	    Shared s2 = new Shared(); 

	    // creating first thread and starting it 
	    Thread1 t1 = new Thread1(s1, s2); 
	    t1.start(); 

	    // creating second thread and starting it 
	    Thread2 t2 = new Thread2(s1, s2); 
	    t2.start(); 

	    // sleeping main thread 
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	    
	    // there will never be test1-end or test2-end
	}

}
