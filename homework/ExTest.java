package homework;

import java.util.Scanner;

public class ExTest {


	public static void main(String[] args) throws Exception{
//		Scanner scanner = new Scanner(System.in);
//		try {
//			double a = scanner.nextDouble();
//			double b = scanner.nextDouble();
//			double c = scanner.nextDouble();
//			QuadraticEquation f = new QuadraticEquation(a,b,c);
//			f.solve();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("a must not be equal to 0!");
//		}
//		catch(Exception e) {
//			System.out.println("delta<0");
//		}
		/////////////////////////////////////////
		VirtualPerson p = new VirtualPerson();
		CoffeeCup cup = new CoffeeCup(45);	
	
		try {
			p.drinkCoffee(cup);
		} catch (TooHotException e) {
			System.out.println(e.getMessage());
		} catch (TooColdException e) {
			System.out.println(e.getMessage());
		} 
	}
	
}

