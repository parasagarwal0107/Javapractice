 package javapack;

 class An{  
	 void eat(){System.out.println("eating");}  
	 }  
	 class Ba extends An{  
	 void eat(){System.out.println("barking");}  
	 }  
	 
public class Inherit {  
		public static void main(String args[]){  
		An d=new Ba();    
		d.eat();  
}
}

