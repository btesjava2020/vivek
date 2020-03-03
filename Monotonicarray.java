package myproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Monotonicarray {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("etner element of an array:");
int n=Integer.parseInt(br.readLine());
int arr[]=new int[n];
System.out.println("enter element of an array:");
for(int i=0;i<=n-1;i++) {
arr [i]=Integer.parseInt(br.readLine());

	}
	for(int i=0;i<=n-1;i++) {
		System.out.println(" "+arr[i]);
	}
	monotonic(arr ,n);
	}
	public static void monotonic(int arr[],int num) {
		System.out.println();
		if(arr[0]<=arr[1]&& arr[num-2]<=arr[num-1]) {
			System.out.println("enter element is monotonic");}
		else if(arr[0]>=arr[1]&&arr[num-2]>=arr[num-1]) {
			System.out.println("enter element is monotonic");}
		else {
			System.out.println("enter element is not monotonic");
		}
	}
	

}
