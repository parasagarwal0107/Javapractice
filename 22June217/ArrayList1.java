package pack;

import java.util.*;

public class ArrayList1 {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("Rahul");
		list.add("jai");
		// list.add(32);//compile time error

		String s = (String)list.get(1);// type casting is not required
		System.out.println("element is: " + s);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
