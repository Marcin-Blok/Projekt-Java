package pl.marcinblok.obiektowosc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {
	private static final String DATA_FORMAT = "dd MMM yyyy";
	public static final int AKTYWNY = 1;
	public static final double PI = 3.14;

	static void dodajIWyswietl(int a, Liczba l) {
		a++;
		System.out.println("Liczba a: " + a);

		l.a++;
		System.out.println("Liczba l: " + l.a);
	}

	// int, double, Adres
	static Adres stworzAdres() {
		Adres adres = new Adres("Mickiewicza", 12, 2, "12-333");
		return adres;
	}

	public static Student stworzStudenta() {
		return new Student("Tomek", "Ziemann",22,"tomek.zieman@onet.pl",stworzAdres(), 14);
	}

	static String pobierzAktualnaDate() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern(DATA_FORMAT));
	}
	
	static String formatujNazwePliku(String nazwaPliku) {
		nazwaPliku = nazwaPliku.replaceAll("³", "l");
		nazwaPliku = nazwaPliku.replaceAll("¹", "a");
		nazwaPliku = nazwaPliku.replaceAll(" ", "_");
		nazwaPliku = nazwaPliku.toLowerCase();
		return nazwaPliku;
	}
	
	
	// 1 + 2
	// 2+ 5+ 5+ 6
	// {}
	// int[12]
	
	static int suma(int ... liczby) {
		int sum = 0;
		
		for(int liczba : liczby) {
			sum += liczba;
		}
		
		return sum;
	}
	
	static void przywitaj(String tekstPowitania, Osoba ... osoby) {
		for(Osoba osoba : osoby) {
			System.out.println(tekstPowitania+osoba.getImie()+". "+osoba.getImie()+osoba.kimJestem());
		}
		
	}
	
}
