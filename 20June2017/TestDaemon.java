package pack;
/*
 * Testing of Daemon thread in java
 */

public class TestDaemon extends Thread {
	
 public void run(){
	 if(Thread.currentThread().isDaemon())//If current Thread is daemon then enters the body
		 {
		 System.out.println("Daemon Thread");
		 }
	 else
		 {
		 System.out.println("Not Daemon");  
		 }
 }	
 
 public static void main(String args[]){
	 
	 TestDaemon thread1 = new TestDaemon();
	 TestDaemon thread2 = new TestDaemon();
	 TestDaemon thread3 = new TestDaemon();

	 thread1.setDaemon(true);//Setting the thread t1 as daemon
  
	 thread1.start();
	 thread2.start();
	 thread3.start();
 }	
}