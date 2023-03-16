package Arrays;

import java.util.Arrays;

public class RepeatedEvenNumbers {

	public static void main(String[] args) {

		int[] list = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 10, 4, 2, 1 };
		int duplicated[] = new int[list.length];
		int startIndex = 0;

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (i != j && list[i] == list[j] && list[i] % 2 == 0) {
					if (!isFind(duplicated, list[i]))
						duplicated[startIndex++] = list[i];
					break;
				}
			}
		}

		System.out.println(Arrays.toString(duplicated));

	}

	static boolean isFind(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}
}
