 package sychronisation;    

class Method1{  
      
     synchronized static void printTable(int n){  
       for(int i=1;i<=10;i++){  
         System.out.println(n*i);  
         try{  
           Thread.sleep(400);  
         }catch(Exception e){}  
       }  
     }  
    }  
      
    class Thread_1 extends Thread{  
    public void run(){  
    Method1.printTable(1);  
    }  
    }  
      
    class Thread_2 extends Thread{  
    public void run(){  
    Method1.printTable(10);  
    }  
    }  
      
    class Thread_3 extends Thread{  
    public void run(){  
    Method1.printTable(100);  
    }  
    }  
      
      
      
      
    class Thread_4 extends Thread{  
    public void run(){  
    Method1.printTable(1000);  
    }  
    }  
      
    public class StaticSynch{  
    public static void main(String t[]){  
    Thread_1 t1=new Thread_1();  
    Thread_2 t2=new Thread_2();  
    Thread_3 t3=new Thread_3();  
    Thread_4 t4=new Thread_4();  
    t1.start();  
    t2.start();  
    t3.start();  
    t4.start();  
    }  
    } 
