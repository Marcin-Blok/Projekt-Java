package pl.marcinblok.obiektowosc;

public class StaticTest {
	public static void main(String[] args) {
		Samochod s1 = new SamochodOsobowy();
		System.out.println(Samochod.liczbaSamochod);
		
		Samochod s2 = new SamochodOsobowy();
		Samochod s3 = new SamochodOsobowy();
		Samochod s4 = new SamochodOsobowy();
		Samochod s5 = new SamochodOsobowy();
		Samochod s6 = new SamochodOsobowy();
		
		System.out.println(Samochod.liczbaSamochod);
		
		// metoda statyczna
		Liczba liczba = new Liczba();
		liczba.a = 5;
		Utils.dodajIWyswietl(2, liczba);
		
		System.out.println(Utils.pobierzAktualnaDate());
	
		if(s1.czyAktywny == Utils.AKTYWNY) {
			System.out.println("Tak, aktywny.");
		}
		
		
		// String
		String tekst1 = "System.out.println(Utils.pobierzAktualnaDate());";
		String tekst11 = "System.out.println(Utils.pobierzAktualnaDate());";
		
		String tekst2 = new String("abc");
		String tekst22 = new String("abc");
		
		System.out.println(tekst1.length());
		System.out.println(tekst1.charAt(47));
		System.out.println(tekst1.equals("System.out.println(Utils"));
		System.out.println(tekst1.equals("System.out.println(Utils.pobierzAktualnaDate());"));
		
		
		System.out.println("5 == 5 "+(5 == 5));
		System.out.println("5 == 2 "+(5 == 2));
		System.out.println("tekst1 == tekst11 "+(tekst1 == tekst11));
		System.out.println("tekst2 == tekst22 "+(tekst2 == tekst22));
		System.out.println("tekst1.equals(tekst11) "+(tekst1.equals(tekst11)));
		System.out.println("tekst2.equals(tekst22) "+(tekst2.equals(tekst22)));
		
		String email = "biuro@szymonleyk.pl";
		// sprawdz poprawnoœæ
		// czy czawiera @
		if(email.contains("@")) {
			if(email.contains(".pl")) {
				System.out.println("To jest mail z domeny .pl");
			} else if (email.contains(".de")) {
				System.out.println("To jest mail z domeny .de");
			} else {
				System.out.println("Nieznana domena.");
			}
		} else {
			System.out.println("Niepoprawny mail. Brakuje '@'.");
		}
		
		// formatuj nazwê
		String nazwaPliku = "Marian jedzie ³odzi¹ - 1.png";
		System.out.println("Sformatowana nazwa: "+Utils.formatujNazwePliku(nazwaPliku));
		

		nazwaPliku = "AmSDFwerj klasdjflAER asdf ³ ¹¹¹¹¹¹¹¹ jedzie ³odzi¹ - 2342341.png";
		System.out.println("Sformatowana nazwa: "+Utils.formatujNazwePliku(nazwaPliku));
		
		String s = String.valueOf(1);
		
		
		// 1 + 2
		// 2+ 5+ 5+ 6
		// {}
		// int[12]
		System.out.println(Utils.suma(1,2));
		System.out.println(Utils.suma(2,5,5,6));
		System.out.println(Utils.suma());
		int[] liczby= {2,5,2,2,6,6,6,6};
		System.out.println(Utils.suma(liczby));
		
		Adres adres = new Adres("Koœciuszki", 22, 1, "44-111");
		
		String tekstPrzywitania = "Witajcie, Panie ";
		Wykladowca w1 = new Wykladowca("Karol", "Nowak", 55, "karol.nowak@wp.pl", adres, 6123.5);
		Wykladowca w2 = new Wykladowca("Marek", "Kowalski", 34, "marek.kowalski@gmail.com", adres, 2222.55);
		Wykladowca w3 = new Wykladowca("Wojtek", "Król", 73, "wojetek.krol@onet.pl", adres, 15000);
		Utils.przywitaj(tekstPrzywitania, w1, w2, w3);
		
	
		System.out.println("Suma 1+2+3: "+Utils.sum(1, 2, 3));

		System.out.println("Suma 1, 2, 3, 4, 2, 1,4: "+Utils.sum(1, 2, 3, 4, 2, 1,4));	

		System.out.println("Suma 1f, 22.3f, 11.2f: "+Utils.sum(1f, 22.3f, 11.2f));
		
		
		System.out.println("dodawanie: "+Utils.dodaj(2, 2));
		System.out.println("dodawanie: "+Utils.dodaj(2.2f, 2.2f));
	}
}
