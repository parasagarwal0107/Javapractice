package pack;

enum Estring{
    ONE("one"),
    TWO ("two"),
    THREE("three");

    private final String name;

    private Estring(String s) {
        name = s;
    }
}
public class TestEnum3 {
	  public static void main(String[] args){
	        System.out.println(Estring.ONE.name());
	    }
}
