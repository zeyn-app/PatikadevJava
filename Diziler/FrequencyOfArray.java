package Arrays;

import java.util.Arrays;

public class FrequencyOfArray {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 20, 10, 10, 20, 5, 20, 30, 40 };
		boolean[] isCount = new boolean[numbers.length];
		Arrays.fill(isCount, false);

		Arrays.sort(numbers);

		/*for (int number : numbers) {
			System.out.print(number + " ");
		}*/

		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			int counter = 1;

			for (int j = 0; j < numbers.length; j++) {
				if (i != j && isCount[j] != true && numbers[i] == numbers[j]) {
					isCount[j] = true;
					counter++;
				}
			}
			if (isCount[i] == false)
				System.out.println(numbers[i] + " is repeated " + counter + " times");

			isCount[i] = true;
		}

	}

}
