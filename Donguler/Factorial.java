package patikadevOdevlerDonguler;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		int result=1;
		
		while(number>=1) {
			result*=number;
			number--;
		}
		
		System.out.println("Result: " + result);
	}

}
