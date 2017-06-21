package pack;

public class TestString {
	public static void main(String args[]){
	
	String s="Paras Agarwal";	
	char ch=s.charAt(1);
	System.out.println(s);
	System.out.println(ch);
	System.out.println(s.contains("Paras"));
	System.out.println(s.substring(2));
	String name=String.join("-","welcome","_","Paras");  
	System.out.println(name);  
	}
}
