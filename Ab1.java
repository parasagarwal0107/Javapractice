package javapack;
interface G{
	void print();
}

public class Ab1 implements G{
	public void print(){System.out.println("Print The Doc");}
	
	public static void main(String args[]){
		Ab1 h=new Ab1();
	    h.print();
		
	}

}
/*Abstraction By Interface*/