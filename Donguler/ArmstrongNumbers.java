package patikadevOdevlerDonguler;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int number;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		number = scn.nextInt();
		
		int tmp= number, counter=0, result=0;
		
		while(tmp>0) {
			tmp/=10;
			counter++;
		}
		tmp=number;
		
		while(tmp>0) {
			int a = tmp%10;
			result +=(int) Math.pow(a, counter);
			tmp/=10;
		}
		
		//result=number ? number + " armstrong sayıdır" : number + " armstrong sayı değildir.";2
		
		
		if(result == number){
			System.out.println(number + " armstrong sayıdır");
		}
		else 
			System.out.println(number + " armstrong sayı değildir.");
		
	}

}
