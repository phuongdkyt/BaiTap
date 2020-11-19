package homework;


import java.lang.Math;

public class QuadraticEquation {
	private double a,b,c;

	public QuadraticEquation(double a, double b, double c) throws Exception {
		this.b=b;
		this.c=c;
		if(a!=0) this.a=a;
		else throw new ArithmeticException();
	};

	public void solve() throws Exception {
		double delta= b*b-4*a*c;
		if(a==0) throw new ArithmeticException();
		else
		{
			if(delta==0) System.out.println("x= "+b/(2*a));
			if(delta>0)
			{ 
				System.out.println("x1= "+(-b-Math.sqrt(delta))/(2*a));
				System.out.println("x2= "+(-b+Math.sqrt(delta))/(2*a)); 
			}
			if(delta<0) throw new Exception();
		}
	}
}