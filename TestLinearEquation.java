import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		float a, b, c, d, e, f;
		Scanner scnr = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter values of a, b, c, d, e and f: ");
		a = scnr.nextFloat();
		b = scnr.nextFloat();
		c = scnr.nextFloat();
		d = scnr.nextFloat();
		e = scnr.nextFloat();
		f = scnr.nextFloat();	
		LinearEquation object1 = new LinearEquation(a, b, c, d, e, f);
		if(isSolvable(a, b, c, d)) {
			System.out.println("The equation is solvable.");
			System.out.println("X =  " + getX(a, b, c, d, e, f));
			System.out.println("Y =  " + getY(a, b, c, d, e, f));
		}
		else {
			System.out.println("The equation is not solvable.");
		}
		//Chapter 9 Exercise 9.12
		System.out.println("To find the intersecting point of two lines - ");
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		float x1 = scnr.nextFloat();
		float y1 = scnr.nextFloat();
		float x2 = scnr.nextFloat();
		float y2 = scnr.nextFloat();
		float x3 = scnr.nextFloat();
		float y3 = scnr.nextFloat();
		float x4 = scnr.nextFloat();
		float y4 = scnr.nextFloat();
		
		float slope1 = (y1 - y2) / (x2 - x1);
		float slope2 = (y3 - y4) / (x4 - x3);
		float intercept1 = ((y1 - y2) * x1 - (x1 - x2) * y1) / (x1 - x2);
		float intercept2 = ((y3 - y4) * x3 - (x3 - x4) * y3) / (x3 - x4);
		
		if(slope1 == slope2) {
			System.out.println("The two lines are parallel.");
		}
		else {
			getSolution(slope1, slope2, intercept1, intercept2);
		}
	}
}
