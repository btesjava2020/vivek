package myproject;
import java.util.Scanner;
public class String_Len_without_inbuilt {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter a string");
		String str =sc.nextLine();
		int count=0;
		char ar[]=str.toCharArray();
		for(char c:ar) {
			count++;}
		System.out.println(count);

	}

}
