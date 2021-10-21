//Chapter 7 Exercise 7.9/7.10/7.20
import java.util.Arrays;
import java.util.Scanner;
public class C_7_Assignment3 {
	
	//Method to print smallest index and smallest element in the array  
	public static double min(double[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	//Method to print index of smallest element in the array 
	private void smallestArray(double[] arr) {
		int myindex = 0;
		double smallest = arr[0];
		for(int i = 1; i < 10; i++) {
			if(arr[i] < smallest) {	
				smallest = arr[i];	
			}
			myindex = i;
		}
		System.out.println("Index of smallest number = " + myindex);
	}
	//Method to print Selection sort swapping the largest number
	private void sorting(double[] arr) {
		int max;
		int temp;
		for(int x = 0; x < 10; x++) {
			max = x;
			for(int j = x + 1; j < 10; j++) {
				if(arr[j] < arr[max]){
					max = j;
				}
				temp = (int) arr[x];
				arr[x] = arr[max];
				arr[max] = temp;
			}	
		}
		for(int z = 0; z < 10; z++) {
			System.out.print(arr[z] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		C_7_Assignment3 obj = new C_7_Assignment3();
		double[] array = new double[10];
		System.out.print("Enter 10 numbers: ");
		//Array input from user 
		for(int i = 0; i < 10; i++) {
			array[i] = scnr.nextFloat();
		}
 		System.out.println("minimum number is "+ obj.min(array));          
 		obj.smallestArray(array);
 		obj.sorting(array);
	}	
}
//////////