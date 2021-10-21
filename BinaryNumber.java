import java.util.*;
public class BinaryNumber {
	Scanner scnr = new Scanner(System.in);
	public BinaryNumber() {
		
	}
	int i =0;
	private int data[];
	
	// 1. Constructor to create array of length-length of binary numbers consisting only zeroes 
	public BinaryNumber(int length) {
		data = new int[length];
		for(i = 0; i< length; i++) {
			data[i] = 0;
			}
		for(i = 0; i< length; i++) {
			System.out.print(data[i]);
			}
		}
	
	//2. constructor to create a binary number given a string 
	
	BinaryNumber(String str){
		int[] ch = new int[str.length()];
		for(i = 0; i < str.length(); i++) {
			int charValue = str.charAt(i);
			ch[i] = Character.getNumericValue(charValue);
		}
		for(i = 0; i < str.length(); i++) {
			System.out.print(ch[i]);
		}
		System.out.println("");
	}
	
	
	// 3. Operation to print length of binary number 
	private void getLength() {
		System.out.println("Enter binary number to find its length:");
		long num = scnr.nextLong();
		boolean a = true;
		try {
			if(num > 1 && num % 10 > 1) {
				System.out.println("Enter binary numbers only(0 and 1)");
				System.exit(0);
			}
			else {
				int length = String.valueOf(num).length();
				System.out.println("Length of the binary number = " +length);
			}
			
			a = false;		
		}
		catch (InputMismatchException ex){
			System.out.println("Enter binary numbers only(0 and 1)");
			
			System.exit(0);
		
		}
	}
	
	//4. Operation to get digit at given index of binary number 
	public int getDigit(int index) {
		int digit = 0;
		return digit;
		
	}
	
	
	//5. Operation to convert binary number to decimal
	private int toDecimal() {
		System.out.println("Enter binary number to convert to decimal: ");
		long num = scnr.nextLong();
		int decimal = 0;
		int temp = (int) num;
		int base = 1;
		while(temp > 0) {
			int x = temp % 10;
			temp = temp / 10;
			decimal += x * base;
			base = base * 2;
		}
		System.out.print(decimal);
		return 0;
	}
	
	//6. Shift right
	public void shiftR(int amount) {
		System.out.println("Enter binary number: ");
		
	}
	
	//Operation to add two binary numbers 
	public void add(BinaryNumber aBinaryNumber) {
		System.out.println("Enter first binary number: ");
		long binary1 = scnr.nextLong();
		System.out.println("Enter second binary nummber: ");
		long binary2 = scnr.nextLong();
		
		
		
	}
	
}
