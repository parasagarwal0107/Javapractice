package pack;

class Table{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class Thread1 extends Thread{ //First Thread  
	Table t;  
	Thread1(Table t){  
	this.t=t;  
	}  
	
	public void run(){  
	t.printTable(10);  
	}  
	  
	}  
	class Thread2 extends Thread{ //Second Thread  
	Table t;  
	Thread2(Table t){  
	this.t=t;  
	} 
	
	public void run(){  
	t.printTable(200);  
	}  
	}  
	  
	public class TestSynch{  
	public static void main(String args[]){  
	Table obj = new Table();//only one object  
	Thread1 thread1=new Thread1(obj);  
	Thread2 thread2=new Thread2(obj);  
	thread1.start();  
	thread2.start();  
	}  
	}  