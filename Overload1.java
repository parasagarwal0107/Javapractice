package javapack;

class E{  
static int calc(int a,int b){return a+b;}  
static double calc(double a,double b){return a+b;}  
}  

public class Overload1 {
	
	public static void main(String[] args){  
		System.out.println(E.calc(10,20));  
		System.out.println(E.calc(30,40));  
		}
}
/*Overloading with same number of arguement but of different data type*/