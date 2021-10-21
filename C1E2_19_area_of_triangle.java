// Question 2.19
// Program to input three points and print the area of the triangle
import java.util.Scanner;

public class C1E2_19_area_of_triangle {

	public static void main(String[] args) {
		Scanner scnr  = new Scanner(System.in);
		
		// Inputting the three points from user
		System.out.println("Enter the coordinates of the three points separated by spaces: ");
		float x1 = scnr.nextFloat();
		float y1 = scnr.nextFloat();
		float x2 = scnr.nextFloat();
		float y2 = scnr.nextFloat();
		float x3 = scnr.nextFloat();
		float y3 = scnr.nextFloat();
		
		// calculating length of first side of the triangle 
		double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Side 1 :" + side1);
		
		// calculating length of the second side of the triangle
		double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		System.out.println("Side 2 :" + side2);
		
		// calculating length of the second side of the triangle
		double side3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		System.out.println("Side 3 :" + side3);
		
		// calculating s
		double s = (side1 + side2 + side3)/2;
		System.out.println("s = "+ s);
		
		// calculating area of the triangle
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		System.out.println("Area of triangle is: " + area);		

		}

	}
