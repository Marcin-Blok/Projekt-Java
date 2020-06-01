package pl.marcinblok.wyrazenia.lambda;

public class Utils {
	public void diplayName(Osoba osoba) {
		System.out.println("Imię osoby: "+osoba.getImie());
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public boolean search(String[] samochody, String poszukiwanySamochod) {
		boolean result = false;
		for (String samochod : samochody) {
			if(samochod.equals(poszukiwanySamochod)) {
				result = true;
			}
		}
		return result;
	}
	
	public static boolean czyPelnoletni(int wiek) {
		return wiek >= 18;
	}
	
	public boolean czyParzysta(int liczba) {
		return liczba%2==0;
	}
	
	public <T extends Number> int roznica (T a, T b) {
		return a.intValue()-b.intValue(); 
	}
	
}
