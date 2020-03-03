package myproject;
import java.util.Scanner;
public class ArrayFrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[]arr=new int[66];
int[]dup=new int[55];
int n,i,j,count;
System.out.println("enter the size of array");
n=sc.nextInt();
System.out.println("enter the  element in the array");
for(i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	dup[i]=-1;
}
for (i=0;i<n;i++) {
	count =1;
	for(j=i+1;j<n;j++) {
		if (arr[i]==arr[j]) {
			count++;
			dup[j]=0;
		}
		if (dup[i]!=0) {
}

}
		System.out.println("duplicate element in Array");
		for(i=0;i<n;i++) {
			System.out.println("number"+arr[i]+"occur"+dup[i]+"time");
		}
	}

	}
}
