package javapack;
class Tester{
	int sal=10000;
}
public class Engineer extends Tester{
	int tax=500;
	
public static void main(String args[]){
	Engineer e=new Engineer();
	System.out.println("Salary="+e.sal);
	System.out.println("Salary="+e.tax);
}
}
