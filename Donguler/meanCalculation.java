package patikadevHafta3;
import java.util.*;

public class meanCalculation {

	public static void main(String[] args) {
		//counter is used to find how many numbers are there
		// sum is used to calculate sum of the numbers
		int counter = 0, sum = 0;
		// number is required from user
		int number, result = sum;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		number = scn.nextInt();
		
		// if number is smaller than 12 then skip these steps
		// if a number is divided by 3 and 4, then it will be divided by 12
		if(number>=12) {
			for(int i = 12; i<number; i++) {
				if(i%12 == 0){
					sum += i;
					counter++;
				}
			}
			result = sum / counter;
		}
		
		System.out.println("Result: " + result);
		
	}

}
