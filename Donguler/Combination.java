package patikadevOdevlerDonguler;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		
		int numberOfElements, numberOfGroups;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Please enter the amount of numbers: ");
		numberOfElements = scn.nextInt() ;
		
		System.out.print("Please enter the amount of groups: ");
		numberOfGroups = scn.nextInt() ;
		
		int result = factorial(numberOfElements)/((factorial(numberOfElements-numberOfGroups))*factorial(numberOfGroups));
		
		System.out.println(result);

	}
	
	public static int factorial(int number) {
		int result = 1;
		while(number>1) {
			result*=number;
			number--;
		}
		
		return result;
	}

}
