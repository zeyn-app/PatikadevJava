package patikadevOdevlerDonguler;
import java.util.*;

public class FindPowerofTwo {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		number = input.nextInt();
		

		for(int i=1; i<=number ; i=i*2) {
			System.out.println(i + "\t");
		}
	}

}
