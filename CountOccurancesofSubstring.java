package myproject;

public class CountOccurancesofSubstring {

	public static void main(String[] args) {
		String str="JavaExamplesJavaCodeJavaProgram";
		String strFind="java";
		int Count=0;int fromIndex=0;
		while((fromIndex=str.indexOf(strFind,fromIndex)) !=-1) {
			System.out.println("found at index:"+fromIndex);
			Count++;
			fromIndex++;
			
		}
System.out.println("total occurrences:"+Count);
	}

}
