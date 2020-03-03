package myproject;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		ArrayList <Student> a1=new ArrayList<Student>();
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		for(Student X:a1) {
			System.out.println(X);
		}
		//System.out.println(X .disp());
			}
}
	
