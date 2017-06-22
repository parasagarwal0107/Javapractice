package pack;
import java.util.*;  
public class ArrayList2 {
    public static void main(String args[]){
    List list = new ArrayList();  
    list.add("hello"); 
    list.add(1);  
    String s = (String) list.get(0);
    Integer i = (Integer) list.get(1);//typecasting
    System.err.println(s);
    System.out.println(i);
 }
}