package javapack;

public class Pcons {
int id;
String name;

Pcons(int i,String n){
	id=i;
	name=n;
 }
void display(){System.out.println(id+" "+name);}


public static void main(String args[]){
	Pcons p1=new Pcons(1,"paras");
	Pcons p2=new Pcons(2,"mohit");
	
	p1.display();
	p2.display();
}
}
