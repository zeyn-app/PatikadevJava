package patikadevOdevler;
import java.util.Scanner;
public class TaksimetreHesaplayanProgram {

	public static void main(String[] args) {
		int minTutar = 20, taksimetreAcilis=10;
		double kmBasi= 2.20, gidilenMesafe, toplamTutar;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen gideceğiniz mesafeyi belirtiniz.");
		gidilenMesafe=input.nextDouble();
		
		toplamTutar = taksimetreAcilis+(gidilenMesafe*kmBasi);
		
		toplamTutar = (toplamTutar<minTutar? minTutar:toplamTutar);
		
		System.out.println("Toplam ödemeniz gereken tutar: "+ toplamTutar);
	}
}
