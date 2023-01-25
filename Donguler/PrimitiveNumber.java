package patikadevOdevlerDonguler;

public class PrimitiveNumber {

	public static void main(String[] args) {
		int flag;

		System.out.print(2);
		for(int i = 3; i<=100; i++) {
			flag =0;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					flag = 1;
				}
			}
			if(flag==0)
				System.out.print(" " + i);
		}

	}

}
