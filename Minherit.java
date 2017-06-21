package javapack;
class A{
	void run(){System.out.println("Running");}
}

class B{
	void run(){System.out.println("Not Running");}
}	

public class Minherit extends A,B{
	
	public static void main(String args[]){
    Minherit m=new Minherit();
    m.run();

}
}
/*Error in Multiple Inheritance sincr their is ambiguity*/
