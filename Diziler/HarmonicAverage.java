package Arrays;

public class HarmonicAverage {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5};
		
		double result = harmonicAverage(numbers);
		
		System.out.println("The result of harmonic average: " + result);
	}

	public static double harmonicAverage(int [] arr) {
		int size = arr.length;
		double sum = 0, harmonicAverage;
		
		for(int i=0; i < size; i++) {
			sum += 1/arr[i];
		}
		
		harmonicAverage = size / sum;
		
		return harmonicAverage;
	}
	
	public static void print(double result) {
		System.out.println("The result of harmonic average: " + result);
	}

}
