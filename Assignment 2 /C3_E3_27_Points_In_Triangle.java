//Chapter 3 Question 3.27 - Points in a triangle
//Program to check whether a point P(x, y)lies inside the given triangle 
//If the point P lies inside the triangle, area of AOB = Area of POA + Area of POB + Area of PAB

import java.util.Scanner;
public class C3_E3_27_Points_In_Triangle {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		float x1 = 0; //point O
		float y1 = 0;	
		float x2 = 0;	//point A
		float y2 = 100;
		float x3 = 200;	//point B
		float y3 = 0;
		
		
		//Calculating lengths of sides of triangle
		final float side_OA = 100;
		final float side_OB =  200;
		float side_AB = (float) 223.6;
		
		// Calculating area of the given triangle ABO
		float area_ABO = (side_OB * side_OA) / 2;
		//System.out.println("Area ABO = " + Math.round(area_ABO));
		
		
		// Getting input from user for point P
		System.out.println("Enter a point's x- and y- coordinates: ");
		float x = scnr.nextFloat();
		float y = scnr.nextFloat();
		
		//Calculating sides PA, PB, PO
		float side_PA = (float) Math.sqrt((x2-x) * (x2 - x) + (y2 - y) * (y2 - y));
		//System.out.println("PA = " +side_PA);
		float side_PB = (float) Math.sqrt((x3-x) * (x3 - x) + (y3 - y) * (y3 - y));
		//System.out.println("PB = " +side_PB);
		float side_PO = (float) Math.sqrt((x1-x) * (x1 - x) + (y1 - y) * (y3 - y));
		//System.out.println("PO = " +side_PO);
		
		
		//Calculating area of the three triangles 
		float s_AOP = (side_PA + side_PO + side_OA) / 2;
		//System.out.println("s_AOP = " + s_AOP);
		float area_AOP = Math.round(Math.sqrt(s_AOP * (s_AOP - side_PA) * (s_AOP - side_PO) * (s_AOP- side_OA)));
		//System.out.println("Area of triangle AOP = " + area_AOP);
		
		float s_POB = (side_PO + side_PB + side_OB) / 2;
		//System.out.println("s_POB = " + s_POB);
		float area_POB = Math.round(Math.sqrt(s_POB * (s_POB - side_PO) * (s_POB - side_PB) * (s_POB - side_OB)));
		//System.out.println("Area of triangle POB = " + area_POB);
		
		float s_PBA = (side_PA + side_PB + side_AB) / 2;
		//System.out.println("s_PBA = " + s_PBA);
		float area_PBA = Math.round(Math.sqrt(s_PBA * (s_PBA - side_PA) * (s_PBA - side_PB) *(s_PBA - side_AB)));
		//System.out.println("Area of triangle POB = " + area_PBA);
		
		// Checking if point lies inside or outside the triangle 
		if(area_ABO == area_AOP + area_POB + area_PBA) {
			System.out.println("Point lies inside the triangle");
		}
		else {
			System.out.println("Point lies outside the triangle");
		}
	}

}
