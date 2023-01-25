package patikadevOdevlerDonguler;

import java.util.Scanner;

public class FoundMaxMinNumber {

	public static void main(String[] args) {
		int countOfNumbers, number, max, min;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter: ");
		countOfNumbers = scanner.nextInt();
		
		if(countOfNumbers>0) {
			System.out.print("1. sayıyı giriniz: ");
			number = scanner.nextInt();
			int i=2;
			max=min=number;
			while(i<=countOfNumbers) {
				System.out.print(i+". sayıyı giriniz: ");
				number = scanner.nextInt();
				
				if(number>max) max=number;
				if(number<min) min=number;
				i++;
			}
			
			System.out.println("En büyük sayı: " + max);
			System.out.println("En küçük sayı: " + min);
		}
		
		else
			System.out.println("Please enter a valid number.");
	
	}

}
