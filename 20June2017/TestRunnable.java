package pack;

public class TestRunnable implements Runnable {
	public void run(){
		System.out.println("Paras Agarwal");
		}
	public static void main(String[] args) {
		
		TestRunnable t = new TestRunnable();
		Thread t1 = new Thread(t);
		
		t1.start();
	}
}
