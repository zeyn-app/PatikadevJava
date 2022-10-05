package patikdevOdevler2;
import java.util.*;
public class ArtikYilHesaplama {

	public static void main(String[] args) {
		int yil;
		String sonuc = " bir artık yıl değildir.";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl Giriniz: ");
		yil = input.nextInt();
		
		if(yil % 4 == 0) {
			if(yil % 100 == 0)
			{
				sonuc = (yil % 400 == 0) ? " bir artık yıldır." : sonuc;
			}
			else
			{
				sonuc = " bir artık yıldır.";
			}
		}
		System.out.println(yil + sonuc);
		

	}

}