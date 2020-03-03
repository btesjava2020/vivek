package myproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {
String reg_id;
String name;
float marks;
public String getReg_id() {
	return reg_id;
}
public void setReg_id(String reg_id) {
	this.reg_id = reg_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}

BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
Student()throws IOException{
	System.out.println("enter registration id:");
	reg_id=br.readLine();
	System.out.println("enter name:");
	name=br.readLine();
	System.out.println("enter marks:");
	marks=Float.parseFloat(br.readLine());
}
	
//instance methods
void disp() {
	System.out.println("Reg_id="+reg_id+""+"Name="+name+""+"Marks="+marks);
}
//public static void main(String[]args)throws IOException {
			//user input
			//System.out.println("enter detail of first student:");
			//Student s1=new Student();
			//System.out.println("enter detail of second student:");
			//Student s2=new Student();
		//	System.out.println("enter detail of third student:");
			//Student s3=new Student();
			//System.out.println();
			//System.out.println(" detail of first student");
			//s1.disp();
			//System.out.println(" detail of second student");
			//s2.disp();
			//System.out.println(" detail of third student");
			//s3.disp();
			

}