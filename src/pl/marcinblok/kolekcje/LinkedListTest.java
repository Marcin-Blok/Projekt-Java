package pl.marcinblok.kolekcje;

public class LinkedListTest {

	public static void main(String[] args) {	
		
		Sklep sklepMiesny = new Sklep();
		
		Osoba o1 = new Osoba("Gabrysia", Status.W_CIAZY);
		sklepMiesny.dodajDoKolejki(o1);
		System.out.println(sklepMiesny.getKolejka());
		
		Osoba o2 = new Osoba("Marek", Status.STANDAR);
		sklepMiesny.dodajDoKolejki(o2);
		System.out.println(sklepMiesny.getKolejka());
		
		sklepMiesny.obsluzKlienta();

		Osoba o3 = new Osoba("Lilianna", Status.WETERAN);
		sklepMiesny.dodajDoKolejki(o3);	
		System.out.println(sklepMiesny.getKolejka());
		
		sklepMiesny.obsluzKlienta();
		
		Osoba o4 = new Osoba("Karol", Status.W_CIAZY);
		sklepMiesny.dodajDoKolejki(o4);
		System.out.println(sklepMiesny.getKolejka());
		
		Osoba o5 = new Osoba("Filip", Status.STANDAR);
		sklepMiesny.dodajDoKolejki(o5);
		System.out.println(sklepMiesny.getKolejka());
		
		sklepMiesny.obsluzKlienta();
		
		System.out.println(sklepMiesny.getKolejka());
		
		Sklep warzywniak = new Sklep();

	}
	
}
