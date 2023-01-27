package Methods;

import java.util.Scanner;

public class DeseneGoreMetot {

	public static void main(String[] args) {
		
		int number, result=0;
		boolean check=false, increase=false;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Please enter the number: ");
		number = scn.nextInt();
		
		calculateRecursively(number, number, check, increase);
		
	}
	
	// check değişkeni recursive fonksiyonunun ilk kez mi çalıştığını kontrol ediyor.
	// increase değişkeni işlemin arttırma mı yoksa azaltma mı olduğunu kontrol ediyor.
	static int calculateRecursively(int number, int copyNumber, boolean check, boolean increase) {
		
		System.out.print(copyNumber + " ");
		
		if(number == copyNumber && check == true) {
			return copyNumber;
		}
		else
			check=true;
		
		if(copyNumber<=0) increase = true;
		
		if(increase == true) {
			return calculateRecursively(number, copyNumber + 5, check, increase);
		}
		
		else
			return calculateRecursively(number, copyNumber - 5, check, increase);
		
	}

}
