package patikadevHafta3;
import java.util.*;

public class Calculate {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number: ");
		Scanner scn = new Scanner(System.in);
		
		int number = scn.nextInt(), sum = 0;
		
		// while the number is even the loop will continue
		while(number%2!=1) {
			
			if(number%4==0) {
				sum += number;
			}
			number = scn.nextInt();			
		}
		
		System.out.println("Result: " + sum);
	}

}
