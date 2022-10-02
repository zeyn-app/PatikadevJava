package patikadevOdevler;

import java.util.Scanner;

public class OdevVucutKitleEndeksiHesaplayanProgram {

	public static void main(String[] args) {
		double boy, kilo, vucutKitleIndeksi;

		Scanner input = new Scanner(System.in);

		System.out.println("Lütfen boyunuzu giriniz (m cinsinden): ");
		boy = input.nextDouble();
		
		System.out.println("Lütfen kilonuzu giriniz (kg cinsinden): ");
		kilo = input.nextDouble();

		vucutKitleIndeksi = kilo / (Math.pow(boy, 2));

		System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);

	}

}
