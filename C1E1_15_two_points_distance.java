// Chapter 1 Question 1.15
// Program to calculate distance between two points 

import java.util.Scanner;

public class C1E1_15_two_points_distance {

		public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	
		// Asking user to enter the coordinates of the first point
		System.out.println("Enter x1 and y1: ");
		float x1 = scnr.nextFloat();
		float y1 = scnr.nextFloat();
		
		// Asking user to input the coordinates of second point
		System.out.println("Enter x2 and y2: ");
		float x2 = scnr.nextFloat();
		float y2 = scnr.nextFloat();
	
		//Calculating the distance
		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	
		System.out.println("The distance between the two points is " + distance);
	

		}

}
