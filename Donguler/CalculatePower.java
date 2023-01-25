package patikadevOdevlerDonguler;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		double base, exponent, result=1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the base: ");
		base = input.nextDouble();
		System.out.print("Please enter the exponent: ");
		exponent = input.nextDouble();

		for(int i=0; i<exponent; i++){
			result*=base;
		}
		
		//result = Math.pow(base, exponent);
		
		System.out.println("Result: " + result);
	}

}
