package patikadevOdevler;

import java.util.Scanner;

public class ManavKasapProgramı {

	public static void main(String[] args) {
		double armutKgFiyat = 2.14, elmaKgFiyat = 3.67, domatesKgFiyat = 1.11, muzKgFiyat = 0.95,
				patlicanKgFiyat = 5.00, toplam = 0;
		int kilo;

		Scanner input = new Scanner(System.in);

		System.out.println("Armut kaç kilo olsun?");
		kilo = input.nextInt();
		toplam += kilo * armutKgFiyat;

		System.out.println("Elma kaç kilo olsun?");
		kilo = input.nextInt();
		toplam += kilo * elmaKgFiyat;

		System.out.println("Domates kaç kilo olsun?");
		kilo = input.nextInt();
		toplam += kilo * domatesKgFiyat;

		System.out.println("Muz kaç kilo olsun?");
		kilo = input.nextInt();
		toplam += kilo * muzKgFiyat;

		System.out.println("Patlıcan kaç kilo olsun?");
		kilo = input.nextInt();
		toplam += kilo * patlicanKgFiyat;

		System.out.println("Toplam tutar: " + toplam);
	}

}
