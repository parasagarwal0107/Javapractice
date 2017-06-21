package javapack;

class D{  
static int calc(int a,int b){return a+b;}  
static int calc(int a,int b,int c){return a+b+c;}  
}  

public class Overload{
	
	public static void main(String[] args){  
		System.out.println(D.calc(10,20));  
		System.out.println(D.calc(30,40,50));  
		}
}
/*Overloading with different no. of arguments*/