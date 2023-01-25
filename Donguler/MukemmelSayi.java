package patikadevOdevlerDonguler;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		int number, result=1;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		number = scnr.nextInt();
		
		for(int i = 2; i<=number/2; i++) {
			if(number%i==0)
				result += i;
		}
		
		if(number==result) System.out.println(number + " Mükemmel sayıdır.");
		else System.out.println(number + " Mükemmel sayı değildir.");

	}

}
