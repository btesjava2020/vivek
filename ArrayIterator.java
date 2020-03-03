package myproject;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayIterator {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>(10) ;
		//Vector a1=new Vector(10);
		for(int i=1;i<=10;i++) {
			a1.add(i);}
			System.out.println("size="+a1.size());
			//System.out.println("a1.capacity()");
			//System.out.println("new capacity"+a1.capacity());
			ListIterator itr =a1.listIterator();
			while(itr.hasNext()) {
				itr.next();
			}
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
			
		}
			}

		}

	
