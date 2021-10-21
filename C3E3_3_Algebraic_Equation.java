// CHapter 3 Question 3.3
// Program to get user input a, b, c, d, e and f and print solution of the 2X2 linear equations 

import java.util.Scanner;
public class C3E3_3_Algebraic_Equation {

	public static void main(String[] args) {
		Scanner scnr  = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f: ");
		float a = scnr.nextFloat();
		float b = scnr.nextFloat();
		float c = scnr.nextFloat();
		float d = scnr.nextFloat();
		float e = scnr.nextFloat();
		float f = scnr.nextFloat();
		//Calculating and printing result x and y
		float x = (e * d - b * f) / (a * d - b * c);
		float y = (a * f - e * c) / (a * d - b * c);
		System.out.println("x is " + x + " and y is " + y);
		
		
	}

}
