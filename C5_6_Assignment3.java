	//Exercise 5.16/5.20/6.10
import java.util.Scanner;
public class C5_6_Assignment3 {
	
//Method to display first 50 prime numbers 
	private void primesLessThan50(){
		System.out.println("First 50 prime numbers are - ");
		int i = 2, prime = 2, num = 1;
		while(num <= 50) {
			boolean flag = true;
			for(i = 2; i < prime; i++) {
				if(prime % i == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
			System.out.print(prime + " ");
			num++;
			}
			prime++;
		}
		System.out.println();	
	}
	//Method to create array with prime numbers from 1 to 1000
	private void primesArray() {
		Scanner scnr = new Scanner(System.in);
		int[] primeArray = new int[169];
		int i = 2, prime = 2, j = 0;
		System.out.println();
		System.out.println("Prime numbers between 1 and 1000 - ");
		for(int index = 0; index <= 1000; index++) {
			boolean flag = true;
				for(i = 2; i < prime; i++) {
					if(prime % i == 0) {
						flag = false;
						break;
					}
				}
				if(flag == true) {
					System.out.print(prime + " ");
					primeArray[j] = prime;
					j++;
				}
				prime++;
		}
		System.out.println();
		int checkPrime = 0;
		int low = 0, high = 168;
		int mid;
		System.out.println();
		String choice = "yes";
		while(choice.toLowerCase() == "yes"){
			System.out.println("Enter a number to check for prime(Between 1 and 1000) : ");
				checkPrime = scnr.nextInt();
				//Binary Search to search if user entered number exists in the primeArray array 
				while(low <= high) {
					mid = (low + high) / 2;
					if(primeArray[mid] < checkPrime) {
						low = mid + 1; 
					}
					else if (primeArray[mid] == checkPrime) {
						System.out.println(checkPrime +" is a prime number");
						break;
					}
					else {
						high = mid - 1;
					}
				}
				if(low > high) {
				//if checkPrime is not in the primeArray array, i.e. it is not a prime number 
					System.out.print(checkPrime + " is not a prime number.");
					System.out.print(" Its factors are - ");
					//Printing factors of checkPrime since it is not a prime number 
					for(int k = 1; k <= checkPrime; k++) {
						if(checkPrime % k == 0) {
							System.out.print(k + ", ");
						}
					}
					System.out.println();
				}	
				System.out.println("Do you want to check for prime again? Type Yes. ");
				choice = scnr.nextLine();
				//System.out.println("Choice = " + choice);
			}
		}
		public static void main(String[] args) {
			C5_6_Assignment3 obj = new C5_6_Assignment3();
			obj.primesLessThan50();
			obj.primesArray();
		}
	}
////////
