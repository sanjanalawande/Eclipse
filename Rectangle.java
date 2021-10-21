//Chapter 9 Exercise 9.5 - Rectangle class woith exception handling

import java.util.InputMismatchException;
import java.util.Scanner;
public class Rectangle {
	double width = 1, height = 1;
	
	/* Non arg constructor that creates a default rectangle */
	Rectangle(){
		width = 1;
		height = 1;
	}
	
	/* Constructor that creates a rectangle with specified width and height*/
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	/* method to return area of the rectangle*/ 
	double getArea() {
		return width * height;
	}
	/* Method to return perimeter of the rectangle */
	double getPerimeter() {
		return (2 * (width + height));
	}
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		try {
			System.out.println("Enter width and height of rectangle: ");
			double _width = scnr.nextDouble();
			double _height = scnr.nextDouble();
			Rectangle rectangle1 = new Rectangle(_width, _height);
			System.out.print("Area of the rectangle with width " + rectangle1.width + " and height " + rectangle1.height 
					+ " = " + rectangle1.getArea() + " sq units");
			System.out.print(" and perimeter = " + rectangle1.getPerimeter() + " units.");
			}
		catch(InputMismatchException ex){
			System.out.println("Enter a valid input for width and height. Try again.");	
		}
	}
}
