package myproject;

import java.util.Vector;

public class ArrayListCapacity {

	private static String size;

	public static void main(String[] args) {
		Vector a1=new Vector(11);
for(int i=1;i<=11;i++) {
	a1.add(i);
	System.out.println("size="+a1.size());	
	System.out.println("a1.capacity()");
	a1.trimToSize();

}
	}

}
