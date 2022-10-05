package patikdevOdevler2;
import java.util.*;
public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {
	
		double mesafe, mesafeBasiFiyat=0.1, toplam;
		int yas, yolculukTipi;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Gideceğiniz mesafeyi giriniz: ");
		mesafe = input.nextDouble();
		
		toplam = mesafe*mesafeBasiFiyat;
		
		System.out.print("Yaşınızı giriniz: ");
		yas = input.nextInt();
		
		System.out.print("Yolculuk tipinizi giriniz\n(Tek yön için (1)Gidiş-Dönüş için (2))");
		yolculukTipi = input.nextInt();
		
		if(mesafe<0 || yas<0|| (yolculukTipi!=1 && yolculukTipi!=2) ) {
			System.out.println("Hatalı Veri Girdiniz!");
		}
		else
		{
			toplam = yas<12 ? toplam/2 : toplam;
			
			toplam = (yas>12 && yas<24) ? (toplam-toplam*0.1) : toplam;
			
			toplam = yas>65 ? (toplam-toplam*0.3) : toplam;
			
			toplam = yolculukTipi==2 ? (toplam-toplam*0.2)*2 : toplam;
			
			System.out.println("Toplam tutar: " + toplam);
		}
		
		
	}

}
