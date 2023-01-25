package patikadevOdevlerDonguler;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		double base, exponent, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the base: ");
		base = input.nextDouble();
		System.out.print("Please enter the exponent: ");
		exponent = input.nextDouble();
		
		result = Math.pow(base, exponent);
		
		System.out.println("Result: " + result);
	}

}
