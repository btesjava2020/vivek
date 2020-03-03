package myproject;

import javax.jws.soap.SOAPBinding;

public class A {
int x;
A(int x){
	this.x=x;
	System.out.println("in parent class overloaded");}
void sum(int x,int y) {
	System.out.println(x+y);
}void sum (int x, int y,int z){
	System.out.println(x+y);
}
void show()
{
	
}
}
