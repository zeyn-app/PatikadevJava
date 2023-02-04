package DigerKonular;

import java.util.Random;
import java.util.Scanner;

public class NumberPredictionGame {

	public static void main(String[] args) {
		// bu bir sayı tahmin oyunudur.
		// Tahmin edilecek sayı 0-100 arasındadır (0 ve 100 dahil değildir.).
		// Sayı random olarak atanmalıdır.
		// Kullanıcının doğru sayıyı bulmak için 5 hakkı vardır.
		// Kullanıcı verilen aralıkta değer girmezse hata almalıdır ve sonraki hatalı
		// irişlerinde hakkından düşülmelidir.
		// Kullanıcının girdiği değer verilen aralıktaysa ve doğru değilse, tahmin
		// edilecek sayıdan büyük mü ya da küçük mü diye belirtilmelidir.
		// Oyun sonunda kullanıcıya doğru veya yanlış girdiğine dair bilgi verilmelidir.

		int prediction, rights = 5;
		boolean isTruePrediction = false;
		String result;

		Random random = new Random();
		int randomNumber = random.nextInt(100);

		Scanner scanner = new Scanner(System.in);

		while (rights > 0) {

			System.out.print("Lütfen tahmininizi giriniz: ");
			prediction = scanner.nextInt();

			if (prediction < 0 || prediction > 99) {
				if (isTruePrediction) {
					rights--;
					System.out.println("Hatalı giriş yaptınız.");

				} else {
					isTruePrediction = true;
					System.out.println(
							"Girdiğiniz değer belirtilen aralıkta değildir. Bir daha yanlış girmeniz durumunda deneme hakkınızdan düşülecektir.");
				}
			}

			else {
				if (prediction == randomNumber) {
					System.out.println("Tebrikler, doğru tahminde bulundunuz. " + randomNumber);
					break;
				} else {
					rights--;
					result = prediction > randomNumber ? "Tahmininiz doğru değerden büyüktür."
							: "Tahmininiz doğru değerden küçüktür.";
					System.out.println(result);
				}
			}

			System.out.println("Kalan hakkınız: " + rights);
			System.out.println("-----------------------------------");
		}

		if (rights == 0)
			System.out.println("Hakkınız bitmiştir. Tekrar deneyiniz");

	}

}
