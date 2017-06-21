package sychronisation;

public class Interrupt3 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String args[]) {
		Interrupt3 t1 = new Interrupt3();
		t1.start();

		t1.interrupt();//Interrupting a thread that is not waiting or sleeping.

	}
}
