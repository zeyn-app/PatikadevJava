package patikadevOdevler;

import java.util.Scanner;

public class NotOrtalamasınıHesaplayanProgram {

	public static void main(String[] args) {
		// Değişkenlerin oluşturulması
		int mat, fizik, kimya, turkce, tarih, muzik;
		int toplam;
		double sonuc;

		// Scanner sınıfı tanımlanarak nesne oluşturuldu.
		Scanner input = new Scanner(System.in);

		// Kullanıcıdan değerler alınıyor.
		System.out.println("Matematik notunuz: ");
		mat = input.nextInt();

		System.out.println("Fizik notunuz: ");
		fizik = input.nextInt();

		System.out.println("Kimya notunuz: ");
		kimya = input.nextInt();

		System.out.println("Türkçe notunuz: ");
		turkce = input.nextInt();

		System.out.println("Tarih notunuz: ");
		tarih = input.nextInt();

		System.out.println("Müzik notunuz: ");
		muzik = input.nextInt();

		toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		sonuc = toplam / 6.0;

		System.out.println("Sınav ortalamanız: " + sonuc);

		String gectiMi = (sonuc < 60) ? "Kaldınız." : "Geçtiniz.";
		System.out.println(gectiMi);

	}

}
