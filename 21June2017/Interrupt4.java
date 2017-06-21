package sychronisation;

public class Interrupt4 extends Thread {

	public void run() {
		for (int i = 1; i <= 2; i++) {
			if (Thread.interrupted()) { // .interrupted will change the value of flag from true to false
				System.out.println("code for interrupted thread");
			} else {
				System.out.println("code for normal thread");
			}

		}// end of for loop
	}

	public static void main(String args[]) {

		Interrupt4 t1 = new Interrupt4();
		Interrupt4 t2 = new Interrupt4();

		t1.start();
		t1.interrupt();

		t2.start();

	}
}