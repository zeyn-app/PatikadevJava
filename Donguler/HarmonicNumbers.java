package patikadevOdevlerDonguler;

import java.util.Scanner;

public class HarmonicNumbers {

	public static void main(String[] args) {
		double number, result=1;
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		number=scn.nextDouble();
		
		for(int i=2; i<=number; i++) {
			result += (1/number);
		}
		
		System.out.println("Result: "+result);
	}

}
