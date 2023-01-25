package patikadevOdevlerDonguler;

import java.util.Scanner;

public class BasamakSayilariToplami {

	public static void main(String[] args) {
		int result = 0, number;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		number = scn.nextInt();


		while(number>0) {
			result += number%10;
			number/=10;
		}
		
		System.out.println("Result: " +result);
	}

}
