package pack;

public class TestJoin extends Thread{
	public void run(){
		System.out.println("Hello");
		}
public static void main(String args[]){
	TestJoin t1=new TestJoin();
	TestJoin t2=new TestJoin();
	TestJoin t3=new TestJoin();
	System.out.println("Name of t1"+t1.getName());
	System.out.println("Name of t2"+t2.getName());
	System.out.println("id"+t1.getId());
	System.out.println("id"+t2.getId());
	System.out.println("id"+t3.getId());
	t1.start();
	/*try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	t2.start();
	t3.start();
	t1.setName("Paras Agarwal");
	t2.setName("Mohit Chauhan");
	System.out.println("Name Changed"+t1.getName());
	System.out.println("Name changed"+t2.getName());
	}
}

