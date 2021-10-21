// Chapter 9 Exercise 9.11 and 9.12
import java.util.Scanner;
public class LinearEquation {
	private float a, b, c, d, e, f;
	
	//Constructor with arguments for a, b, c, d, e, f
	LinearEquation(float _a, float _b, float _c, float _d, float _e, float _f){
		a = _a;
		b = _b;
		c = _c;
		d = _d;
		e = _e;
		f = _f;	
	}
	static boolean isSolvable(float a, float b, float c, float d){
		if((a * d - b * c) != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static float getX(float a , float b, float c, float d, float e, float f) {
		float X = 0;
		return X = (e * d - b * f) / (a * d - b * c);
	}
	public static float getY(float a, float b, float c, float d, float e, float f) {
		float Y = 0;
		return Y = (a * f - e * c) / (a * d - b * c);
	}
	
	
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
	private static void getSolution(float slope1, float slope2, float intercept1, float intercept2) {
		float intersectionX, intersectionY;
		intersectionX = (intercept2 - intercept1) / (slope2 - slope1);
		intersectionY = slope1 * intersectionX + intercept1;
		System.out.println("Imsection point of the two lines = (" + intersectionX + ", " + intersectionY + ")");
	}

	
	
	
	
}
