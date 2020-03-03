package myproject;

public class Pattrenstars {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int s=4,l=1;
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=s;j++)
	{
			System.out.print(" ");
		}
for(int j=1;j<=l;j++)
		{
			System.out.print("*");
		}
	
		System.out.println();
		s--;
		l+=2;
	}
}
	}


