package Methods;

import java.util.Scanner;

public class PrimitiveNumberUsingRecursive {

	public static void main(String[] args) {
		int number;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Please enter the number: ");
		number = scn.nextInt();
		
		
		int result = primitiveNumberCalculator(number, number/2);
		
		if(result==1) System.out.println("Not primitive");
		else System.out.println("Primitive number");

	}
	
	static int primitiveNumberCalculator(int number, int counter) {
		
		if(counter>1) {
			if(number%counter==0){
				return 1;
			}
			
			else {
				return primitiveNumberCalculator(number, counter-1);
			}
		}
		
		return 0;
		
	}

}
