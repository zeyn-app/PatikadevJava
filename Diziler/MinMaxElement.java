package Arrays;

import java.util.Arrays;

public class MinMaxElement {

	public static void main(String[] args) {
		int[] list = { 56, 34, 1, 8, 101, -2, -33 };

		String min = "Minimum number is ";
		String max = "Maximum number is ";
		print(min, findMin(list));
		print(max, findMax(list));

	}

	public static int findMin(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

	public static int findMax(int[] arr) {
		int size = arr.length;
		Arrays.sort(arr);

		return arr[size - 1];
	}

	public static void print(String str, int number) {
		System.out.println(str + number);
	}
}
