package package1;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b){
		try {
			System.out.println("Waiting for B to complete");
			b.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total is: " + b.total);
	}
}
}
