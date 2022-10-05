package patikdevOdevler2;
import java.util.*;
public class HavaSicakliginaGoreEtkinlikOnerme {

	public static void main(String[] args) {
		
		int havaSicakligi;
		String oneri;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sıcaklık değerini giriniz: ");
		havaSicakligi=input.nextInt();
		
		if(havaSicakligi<5)oneri="Kayak";
		else if(havaSicakligi>=5 && havaSicakligi<=15) oneri = "Sinema";
		else if(havaSicakligi>15 && havaSicakligi<=25) oneri = "Piknik";
		else oneri = "Yüzme";
		
		System.out.println("Sizin için en uygun etkinlik: " + oneri);
	}

}
