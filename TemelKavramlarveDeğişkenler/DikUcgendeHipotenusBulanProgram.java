package patikadevOdevler;
import java.util.Scanner;
public class DikUcgendeHipotenusBulanProgram {

	public static void main(String[] args) {
		double dikKenar1, dikKenar2, alan, hipotenus, u;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen dik kenarları giriniz");
		dikKenar1 = input.nextDouble();
		dikKenar2 = input.nextDouble();
		
		hipotenus = (Math.sqrt((Math.pow(dikKenar1,2))+(Math.pow(dikKenar2,2))));
		System.out.println("Hipotenüs: " + hipotenus);
		
		u = (dikKenar1+dikKenar2+hipotenus)/2;
		alan = Math.sqrt(u*(u-dikKenar1)*(u-dikKenar2)*(u-hipotenus));		
		
		System.out.println("Alan: " + alan);

	}

}
