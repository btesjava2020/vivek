package myproject;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter any number");
int table =s.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(table+"x"+"="+table*i);
}
	}

}
