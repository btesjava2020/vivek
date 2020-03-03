package myproject;

public class Prime {
public static void printNum(int n) {
	//num is less than or equal to 100
	if(n <= 100) {
		// print the value of num
		System.out.println(n+ " ");
		printNum(n+1);
	}
	}
	public static void main(String[] args) {
		int n=1;
	    printNum(n);
	}


}