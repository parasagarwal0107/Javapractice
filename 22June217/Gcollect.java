package pack;


public class Gcollect{  
    public void finalize(){System.out.println("object is garbage collected");}  
    public static void main(String args[]){  
     Gcollect s1=new Gcollect();  
     Gcollect s2=new Gcollect();  
     s1=null;  
     s2=null;  
     System.gc();  
    }  
   }  