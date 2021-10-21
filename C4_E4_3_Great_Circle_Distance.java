// Chapter 4 Question 4.3
// Program to calculate great circle distance by getting geographical latitude and longitude from user

import java.util.Scanner;
public class C4_E4_3_Great_Circle_Distance {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = scnr.nextDouble();
		double y1 = scnr.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = scnr.nextDouble();
		double y2 = scnr.nextDouble();
		final double radius = 6371.01;
		double d = 0;
		//calculating d using the great circle distance formula
		 d = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) 
				+ Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) 
				* Math.cos(Math.toRadians(y2 - y1)));
		
		System.out.println("The distance between the points is: " + d + " km");
		
	}

}
