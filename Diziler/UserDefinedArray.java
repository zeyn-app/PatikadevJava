package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserDefinedArray {

	public static void main(String[] args) {
		System.out.println("Kaç elemanlı dizi oluşturulsun?");
		int length = getElement();
		
		printSortedArray(implementArray(length));

	}
	
	public static int [] implementArray(int size) {
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print((i+1) + ". elemanı giriniz: ");
			arr[i] = getElement();
		}
		return arr;
	}
	
	public static int getElement() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	public static void printSortedArray(int [] arr) {
		Arrays.sort(arr);
		System.out.print("\nSıralama: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
