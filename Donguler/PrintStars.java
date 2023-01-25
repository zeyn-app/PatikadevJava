package patikadevOdevlerDonguler;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {

		int number, flag;
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter the number: ");
		number = scn.nextInt();

		for (int i = 1; i <= number; i++) {
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
		
		for (int i = number-1; i >= 1; i--) {
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
