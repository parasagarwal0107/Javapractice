package sychronisation;
/**
 * After interrupting the Thread we are Propagating it so it will stop working.
 */
public class Interrupt1 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted" + e);
		}

	}

	public static void main(String args[]) {
		Interrupt1 t1 = new Interrupt1();
		t1.start();
		try {
			t1.interrupt();
		} catch (Exception e) {
			System.out.println("Exception handled " + e);
		}

	}
}