package sychronisation;

class Method{  
     
    void printTable(int n){  
    System.out.println("Paras");
    System.out.println("Agarwal");
    
    
      synchronized(this){//synchronized block 
    	
        for(int i=1;i<=5;i++){  
         System.out.println(n*i);  
         try{  
          Thread.sleep(400);  
         }catch(Exception e){System.out.println(e);}  
        }  
      }  
    }//end of the method  
   }  
     
   class Thread1 extends Thread{  
   Method m;  
   Thread1(Method m){  
   this.m=m;  
   }  
   public void run(){  
   m.printTable(5);  
   }  
     
   }  
   class Thread2 extends Thread{  
   Method m;  
   Thread2(Method m){  
   this.m=m;  
   }  
   public void run(){  
   m.printTable(100);  
   }  
   }  
     
   public class SynchBlock{  
   public static void main(String args[]){  
   int String=10;
   Method obj = new Method();//only one object  
   Thread1 thread1=new Thread1(obj);  
   Thread2 thread2=new Thread2(obj);  
   thread1.start();  
   thread2.start();  
   }  
   }  
