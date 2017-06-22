package pack;

class Task1 extends Thread {
	public void run() {
		System.out.println("task one");
	}
}

class Task2 extends Thread {
	public void run() {
		System.out.println("task two");
	}
}

class MultiTasking {
	public static void main(String args[]) {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();

		t1.start();
		t2.start();
	}
}
