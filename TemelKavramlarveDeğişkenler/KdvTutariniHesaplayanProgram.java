package patikadevOdevler;

import java.util.Scanner;

public class KdvTutariniHesaplayanProgram {

	public static void main(String[] args) {

		double paraDegeri, kdvMiktari, kdvliFiyat = 0, kdvTutari;

		Scanner input = new Scanner(System.in);

		System.out.println("KDV oranını hesaplamak istediğiniz tutarı giriniz: ");
		paraDegeri = input.nextDouble();

		kdvMiktari = (paraDegeri > 0 && paraDegeri < 1000) ? 0.18 : 0.08;

		kdvliFiyat = paraDegeri + (paraDegeri * kdvMiktari);
		kdvTutari = kdvliFiyat - paraDegeri;

		System.out.println("KDV'li fiyat: " + kdvliFiyat + "\nKDV tutarı: " + kdvTutari);
		input.close();

	}
}
