  package pack;

public class Trycatch {
    public static void main(String args[]){  
        try{  
           int data=50/0;  //Arithmetic Exception
        }catch(ArithmeticException e){System.out.println("Exception");}  
        System.out.println("rest of the code...");  

}
}
