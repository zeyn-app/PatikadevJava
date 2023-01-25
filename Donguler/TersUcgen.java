package patikadevOdevlerDonguler;

import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
		int number, flag;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		number = scnr.nextInt();
		
		for (int i = number; i >= 1; i--) {
			flag = 0;
			for (int j = 1; j < number * 2; j++) {
				if (i + j == number + 1)
					flag = 1;

				if (j < (number + i) && flag == 1) {
					System.out.print("*");
				}

				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
