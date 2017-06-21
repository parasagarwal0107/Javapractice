package javapack;

class C{  
static int calc(int a,int b){return a+b;}  
static double calc(int a,int b){return a+b;}  
}  

public class Overload2{
	
	public static void main(String[] args){  
		System.out.println(C.calc(10,20));  
		System.out.println(C.calc(30,40));  
		}
}
/*Overloading not possible with only changing the returntype as it is showing duplicate that is ambiguity*/