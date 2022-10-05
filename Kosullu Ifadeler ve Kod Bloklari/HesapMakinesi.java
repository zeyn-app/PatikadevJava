package patikdevOdevler2;
import java.util.*;
public class HesapMakinesi {

	public static void main(String[] args) {

		double number1, number2, result;
		int choice;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		number1 = input.nextDouble();
		System.out.print("Please enter the second number: ");
		number2 = input.nextDouble();
		System.out.println("Please choose your operation\n"
				+ "Add(+): ...........Press 1\n"
				+ "Subtract(-): ......Press 2\n"
				+ "Divide(/): ........Press 3\n"
				+ "Multiply(*): ......Press 4\n");
		choice = input.nextInt();
		
		switch(choice) {
		
		case 1:
			result = number1+number2;
			System.out.println("Result: "+result);
			break;
			
		case 2:
			result = number1-number2;
			System.out.println("Result: "+result);
			break;
			
		case 3:
			if(number2==0) {
				System.out.println("You can't divide any number divide by zero");
				break;
			}else
			{
				result = number1/number2;
				System.out.println("Result: "+result);
				break;
			}
			
		case 4:
			result = number1 *number2;
			System.out.println("Result: "+result);
			break;
		}

	}

}
