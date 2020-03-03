package myproject;
import java.io.*;
public class Diamond {

	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter character for limit");
		char ch =(char)br.readLine().charAt(0);
		for(char i='a';i<=ch;i++) {
			for(char j=i;j<=ch;j++) {
				System.out.println(" ");
			}
			for(char j='a';j<=i;j++) {
				System.out.println(j+" ");
			}
			for(char j=(char)(i-1);j>='a';j--) {
				System.out.print(j+" ");
			}
			System.out.println();}
		System.out.println(" ");
		for(char s=(char)(ch-1),i='a';i<ch;i++,s--) {
			for(char j='a';j<=i;i++) {
				System.out.print(" ");
				} 
			for(char j='a';j<=s;j++) {
			System.out.print(j+" ");
			}
			for(char j=(char)(s-1);j>='a';j--) {
				System.out.println(j+" ");
			}
			System.out.println();
			System.out.println(" ");
			}
		}
	}
		// TODO Auto-generated method stub
