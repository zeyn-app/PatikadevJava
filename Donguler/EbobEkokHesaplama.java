package patikadevOdevlerDonguler;

import java.util.Scanner;

public class EbobEkokHesaplama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int firstNumber, secondNumber, ebob=1, ekok, i=1;
		
		System.out.print("Enter the first number: ");
		firstNumber = input.nextInt();
		
		System.out.print("Enter the second number: ");
		secondNumber = input.nextInt();
		
		while(i<firstNumber) {
			if(firstNumber%i==0 && secondNumber%i==0) {
				ebob = i;
			}
			i++;
		}
		
		ekok=(firstNumber*secondNumber)/ebob;
		
		System.out.println("Ebob: " + ebob + "\nEkok: " + ekok);

	}

}
