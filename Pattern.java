package myproject;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
		System.out.println();
		}

			}


	}


