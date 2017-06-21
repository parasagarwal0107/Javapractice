package pack;

public class TestThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
		 try{
			 Thread.sleep(5500);
		 }catch(Exception e){System.out.println(e);}
		 System.out.println(i);
		}
	}
public static void main(String args[]){
	TestThread t1=new TestThread();
	TestThread t2=new TestThread();
	TestThread t3=new TestThread();
	t1.start();
	try{
		t1.join(1500);
	 }catch(Exception e){System.out.println(e);}
	t2.start();
	t3.start();
	}
}
