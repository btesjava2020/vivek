package myproject;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
System.out.print("Enter any number ");
int num=s.nextInt ();//123
int n=num;
int len=0,temp,sum=0,pow=1;
for(;num>0;)
{
	num=num/10;
			len++;
}
System.out.println(len);
for (int i=1;i<=len;i++) {
	temp=num%10;
			for(int j=1;j<=len;j++)
			{
				pow=pow*temp;}
	sum=sum*pow;
	pow=1;
	num=num/10;
			}
System.out.println(sum);
if(sum==n)
{
	System.out.println("Armstrong");
}
	}

}
