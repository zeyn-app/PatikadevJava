package patikdevOdevler2;
import java.util.*;
public class BurcTahmini {

	public static void main(String[] args) {
		int gun, ay;
		String burc = " ";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Dogudunuz ayı giriniz: ");
		ay = input.nextInt();
		System.out.println("Dogudunuz gunu giriniz: ");
		gun = input.nextInt();
		
		
		if(ay==1)
		{
			if(gun<=21) burc = "Oğlak Burcu";
			else burc = "Kova Burcu"; 
		}

		if(ay==2)
		{
			if(gun<=19) burc = "Kova Burcu";
			else burc = "Balık Burcu"; 
		}

		if(ay==3)
		{
			if(gun<=20) burc = "Balık Burcu";
			else burc = "Koç Burcu"; 
		}

		if(ay==4)
		{
			if(gun<=20) burc = "Koç Burcu";
			else burc = "Boğa Burcu"; 
		}

		if(ay==5)
		{
			if(gun<=21) burc = "Boğa Burcu";
			else burc = "İkizler Burcu"; 
		}

		if(ay==6)
		{
			if(gun<=22) burc = "İkizler Burcu";
			else burc = "Yengeç Burcu"; 
		}

		if(ay==7)
		{
			if(gun<=22) burc = "Yengeç Burcu";
			else burc = "Aslan Burcu"; 
		}

		if(ay==8)
		{
			if(gun<=22) burc = "Aslan Burcu";
			else burc = "Başak Burcu"; 
		}

		if(ay==9)
		{
			if(gun<=22) burc = "Başak Burcu";
			else burc = "Terazi Burcu"; 
		}

		if(ay==10)
		{
			if(gun<=22) burc = "Terazi Burcu";
			else burc = "Akrep Burcu"; 
		}

		if(ay==11)
		{
			if(gun<=21) burc = "Akrep Burcu";
			else burc = "Yay Burcu"; 
		}

		if(ay==12)
		{
			if(gun<=21) burc = "Yay Burcu";
			else burc = "Oğlak Burcu"; 
		}
		
		System.out.println("Burcunuz: " + burc);		
	}
}
