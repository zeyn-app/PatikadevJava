package patikadevHafta3;

import java.util.Scanner;

public class KatlariBulma {

	public static void main(String[] args) {
/*
		int counterForFour = 0, counterForFive = 0;
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			// number is entered from user
			int number = scn.nextInt();
			
			// number is equalized to variables for 4 and 5
			int numberFour = number, numberFive = number;
			
			// continue while number is grater than 4 or 5
			while(numberFour>=4 || numberFive>=5) {
				
				// if number is grater than 5 
				if(numberFive>=5) {
					numberFive /= 5;
					counterForFive++;
				}
				numberFour /= 4;
				counterForFour++;
			}
		}
		
		// print the pow of 4 and 5 on the screen
		System.out.print("The powers of 4: ");
		for(int i = 0; i<=counterForFour; i++) {
			System.out.print(i + "^4 = " + (int)(Math.pow(4, i)) + " ");
		}
		
		System.out.print("\nThe powers of 5: ");
		for(int i = 0; i<=counterForFive; i++) {
			System.out.print(i + "^5 = " + (int)(Math.pow(5, i)) + " ");
		}*/
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scn.nextInt();
		
		System.out.print("The powers of 4: ");
		for(int i = 1; i<=number; i*=4) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nThe powers of 5: ");
		for(int i = 1; i<=number; i*=5) {
			System.out.print(i + " ");
		}
		
		
	}

}
