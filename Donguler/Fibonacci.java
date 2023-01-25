package patikadevOdevlerDonguler;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int number, nmbr1=0, nmbr2=1;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		number = scn.nextInt();
		
		if(number>2) {
			for(int i=1; i<=number;i++) {
				System.out.print(nmbr1+" ");
				int tmp=nmbr1;
				nmbr1=nmbr2; 
				nmbr2+=tmp; 
			}
		}

	}

}
