package DeadLock;

public class Thread1 extends Thread{
	private Shared s1 = new Shared();
	private Shared s2 = new Shared();
	
	public Thread1(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			s1.test1(s2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
