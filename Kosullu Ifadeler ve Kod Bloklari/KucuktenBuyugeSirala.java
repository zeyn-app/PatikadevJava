package patikdevOdevler2;

public class KucuktenBuyugeSirala {

	public static void main(String[] args) {
		int sayi1 = -5, sayi2 = 10, sayi3 = 13, buyuk, orta, kucuk;
		
		if(sayi1>sayi2)
		{
			if(sayi1>sayi3)
			{
				buyuk = sayi1;
				if(sayi2>sayi3)
				{
					orta=sayi2;
					kucuk = sayi3;
				}
				else 
				{
					orta=sayi3;
					kucuk = sayi2;
				}
			}
			else 
			{
				buyuk = sayi3;
				orta = sayi1;
				kucuk = sayi2;
			}
		}
		else // 2>1
		{
			if(sayi2>sayi3)
			{
				buyuk = sayi2;
				
				if(sayi1>sayi3)
				{
					orta=sayi1;
					kucuk = sayi3;
				}
				else
				{
					orta=sayi3;
					kucuk = sayi1;
				}
			}
			else // 3>2
			{
				buyuk = sayi3;
				orta = sayi2;
				kucuk = sayi1;
			}
		}
		
		System.out.println(kucuk + ">" + orta + ">" + buyuk);

	}

}
