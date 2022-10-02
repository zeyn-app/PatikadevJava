package patikadevOdevler;

import java.util.Scanner;

public class DaireAlaniniVeCevresiniHesaplayanProgram {

	public static void main(String[] args) {
		double alan, cevre, yariCap, piSayisi = 3.14, merkezAci, daireDilimiAlani;

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen yarı çapı giriniz: ");
		yariCap = input.nextDouble();

		alan = piSayisi * Math.pow(yariCap, 2);
		cevre = 2 * piSayisi * yariCap;
		System.out.println("Alan: " + alan + "\nÇevre: " + cevre);
		System.out.println("Merkez açı ölçüsünü giriniz.");
		merkezAci = input.nextDouble();

		daireDilimiAlani = (Math.pow(yariCap, 2) * piSayisi * merkezAci) / 360;

		System.out.println("Daire Diliminin Alanı: " + daireDilimiAlani);
	}
}
