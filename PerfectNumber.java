package myproject;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,sum=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter a number");
num = in.nextInt();
if(num>0) {
	for (int i=1;i<num;i++) {
		if(num % i==0) {
			sum=sum+i;
		}
	}
	if(sum==num) {
		System.out.println(num+"is a perfect number");
	}else {
		System.out.println(num+"is not a perfect number");
	}
}else {
	System.out.println("Please enter a positive number");
}
	}
}

