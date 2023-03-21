package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxElement {

	public static void main(String[] args) {
		int[] list = { 56, 34, 1, 8, 101, -2, -33 };
		
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		String min = "The nearest number that greater than entered number ";
		String max = "The nearest number that smaller than entered number ";

		
		print(min, findMin(list, number));
		print(max, findMax(list, number));
		
		/*Arrays.sort(list);
		
		for (int i : list) {
			System.out.print(i + " ");
		}*/

	}

	public static int findMin(int[] arr, int number) {
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]<number) {
				return arr[i];
			}
		}
		return -1;
	}

	public static int findMax(int[] arr, int number) {
		int size = arr.length;
		Arrays.sort(arr);
		
		for(int i=0; i<size; i++) {
			if(arr[i]>number) {
				return arr[i];
			}
		}

		return -1;
	}

	public static void print(String str, int number) {
		System.out.println(str + number);
	}
}
