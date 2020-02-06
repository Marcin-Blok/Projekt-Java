package pl.marcinblok.obiektowosc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class Utils {
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
	
	static <T extends Number> long sum(T ... elementy) {
		long sum = 0;
		for(T e : elementy) {
			sum += e.longValue();
		}
		return sum;
	}
	
	
//	static int dodaj(int a, int b) {
//		return a+b;
//	}
//	
//	static float dodaj(float a, float b) {
//		return a+b;
//	}
	
	static <T extends Number> float dodaj(T a, T b) {
		return a.floatValue()+b.floatValue();
	}
	
	
	static void przywitaj(String tekstPowitania, Osoba ... osoby) {
		for(Osoba osoba : osoby) {
			System.out.println(tekstPowitania+osoba.getImie()+". "+osoba.getImie()+osoba.kimJestem());
		}
		
	}
	
	
	static void wyswietlWyniki(Podium<Samochod> p1, Podium<Student> p2) {
		System.out.println(p1);
		System.out.println(p2);
	}
	
	static void wyswietlWynikiArgumentWieloznaczny(Podium<?> p1, Podium<?> p2) {
		System.out.println(p1);
		System.out.println(p2);
	}
	
	static void wyswietlWynikiArgumentObject(Object p1, Object p2) {
		System.out.println(p1);
		System.out.println(p2);
	}
	
	static void wyswietlWynikiArgumentWieloznaczny(Podium<?> ... podia) {
		for(Podium<?> podium : podia) {
			System.out.println(podium);
		}
	}
	
}
