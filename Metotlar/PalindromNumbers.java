package Methods;

import java.util.Scanner;

public class PalindromNumbers {

	public static void main(String[] args) {
		int number, counter=0, result = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		number = scn.nextInt();
		
		int tmp=number;
		
		// basamak sayısı hesaplandı.
		while(number>0) {
			number/=10;
			counter++;
		}
		
		number=tmp;
		
		// grilen sayının tersi bulundu.
		while(counter>0) {
			result+=(number%10)*Math.pow(10, counter-1); 
			number/=10;
			counter--;
		}
		
		if(tmp==result)
			System.out.println(tmp+" Palindrom sayıdır");
		else 
			System.out.println(tmp+" Palindrom sayı değildir");
		
	}

}
