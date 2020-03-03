package myproject;

public class Vowle {

	public static void main(String[] args) {
		int count=0;
		String S="Bebo Technical Education Services";
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='a'|| S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
			count++;
		}
		System.out.print("vowles are ="+count);
			
		
	} 

}
