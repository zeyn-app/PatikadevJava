package patikdevOdevler2;
import java.util.*;
public class SinifGecmeDurumu {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik, dersSayisi=0, toplam=0, sonuc;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik sonucunuzu giriniz: ");
		mat = input.nextInt();
		System.out.print("Fizik sonucunuzu giriniz: ");
		fizik = input.nextInt();
		System.out.print("Türkçe sonucunuzu giriniz: ");
		turkce = input.nextInt();
		System.out.print("Kimya sonucunuzu giriniz: ");
		kimya = input.nextInt();
		System.out.print("Müzik sonucunuzu giriniz: ");
		muzik = input.nextInt();
		
		if(mat>=0 && mat<=100)
		{
			dersSayisi++;
			toplam += mat;
		}
		if(fizik>=0 && fizik<=100)
		{
			dersSayisi++;
			toplam += fizik;
		}
		if(turkce>=0 && turkce<=100)
		{
			dersSayisi++;
			toplam += turkce;
		}
		if(kimya>=0 && kimya<=100)
		{
			dersSayisi++;
			toplam += kimya;
		}
		if(muzik>=0 && muzik<=100)
		{
			dersSayisi++;
			toplam += muzik;
		}
		
		sonuc = toplam/dersSayisi;
		
		String gectinMi = sonuc>=55 ? "Geçtiniz" : "Geçemediniz.";
		
		System.out.println("Sonuç: " + gectinMi);

	}

}
