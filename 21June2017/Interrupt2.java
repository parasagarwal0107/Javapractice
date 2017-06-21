package sychronisation;
/**
 * 
 * In this example : The exception is handled after the interruption of the thread.
 *
 */
public class Interrupt2 extends Thread{  
    public void run(){  
    try{  
    Thread.sleep(1000);  
    System.out.println("task");  
    }catch(InterruptedException e){  
    System.out.println("Exception handled "+e);  
    }  
    System.out.println("thread is running...");  
    }  
      
    public static void main(String args[]){  
    Interrupt2 t1=new Interrupt2();  
    t1.start();  
      
    t1.interrupt();  
      
    }  
    }  
