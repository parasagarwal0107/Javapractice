package pack;

class Reentrant {
	public synchronized void m() {
		n();
		System.out.println("Paras");
	}

	public synchronized void n() {
		System.out.println("Agarwal");
	}
}

public class TestReentrant {
	public static void main(String args[]) {
		final Reentrant re = new Reentrant();

		Thread t1 = new Thread() {
			public void run() {
				re.m();// calling method of Reentrant class
			}
		};
		t1.start();
	}
}
