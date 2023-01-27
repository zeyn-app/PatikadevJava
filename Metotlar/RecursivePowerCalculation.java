package Methods;

import java.util.Scanner;

public class RecursivePowerCalculation {

	public static void main(String[] args) {
		int base, power, result;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the base: ");
		base = scn.nextInt();
		
		System.out.println("Enter the power: ");
		power = scn.nextInt();
		
		result=base;
		System.out.println("Sonuç: " + calculatePower(base, result, power));

	}
	
	static int calculatePower(int base, int result, int power) {
		
		if(power==1)
			return base;
		else 
		{
			base*=result;
			return calculatePower(base, result, power-1);
		}
	}

}
