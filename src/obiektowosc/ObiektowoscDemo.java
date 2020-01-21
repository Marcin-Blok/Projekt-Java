package obiektowosc;

public class ObiektowoscDemo {
	public static void main(String[] args) {
		System.out.println("------ Obiektowoœæ ------");

		// deklaracja obiektu
		Samochod prywatny;
		// alokacja obiektu
		prywatny = new Samochod("zielony", "mercedes", 123_123, 15000);
		prywatny.info();

		System.out.println("-------------------");

		Samochod testowy = new Samochod();
		testowy.kolor = "czerwony";
		testowy.info();

		System.out.println("-------------------");

		Samochod sluzbowy = prywatny;
		System.out.println("Cena samochodu sluzbowego: " + sluzbowy.cena);
		prywatny.cena = 10;
		System.out.println("Cena samochodu sluzbowego: " + sluzbowy.cena);
		sluzbowy.cena = 10_000;
		System.out.println("Cena samochodu prywatny: " + prywatny.cena);

		System.out.println("-------------------");
		testowy.cena = 12000;
		System.out.println("Cena samochodu testowego: " + testowy.cena);
		System.out.println("Cena samochodu testowego po rabacie 10%: " + testowy.cenaPoRabacie10procent());
		System.out.println("Cena samochodu testowego po rabacie 10%: " + testowy.cenaPoRabacie10procent());
		System.out.println("Cena samochodu testowego po rabacie 10%: " + testowy.cenaPoRabacie10procent());
		testowy.obnizCeneSamochodu(500);
		testowy.obnizCeneSamochodu(500);
		System.out.println("Cena samochodu testowego: " + testowy.cena);
		testowy.obnizCeneSamochodu(500);
		testowy.obnizCeneSamochodu(500);
		System.out.println("Cena samochodu testowego: " + testowy.cena);
		System.out.println("Cena samochodu testowego po rabacie 10%: " + testowy.cenaPoRabacie10procent());
		System.out.println("Cena samochodu testowego po rabacie 10%: " + testowy.cenaPoRabacie10procent());

		double rabat = 0.2;
		System.out.println("Cena samochodu testowego po rabacie 20%: " + testowy.cenaPoRabacie(rabat));

		System.out.println("Cena samochodu testowego po rabacie 50%: " + testowy.cenaPoRabacie(0.5));
		System.out.println("Cena samochodu testowego po rabacie 50%: " + testowy.cenaPoRabacie(50));

		System.out.println("-------------------");
		Osoba klient1 = new Osoba();
		klient1.imie = "Marian";
		klient1.nazwisko = "Kowalski";
		klient1.wiek = 44;

		Osoba klient2 = new Osoba();
		klient2.imie = "Ela";
		klient2.nazwisko = "Miotk";
		klient2.wiek = 22;

		String tekstPowitania = "Witaj ";
		String znakKoncowy = "!";
		klient1.przywitaj(tekstPowitania, znakKoncowy);
		klient2.przywitaj(tekstPowitania, znakKoncowy);

		System.out.println("----------------------------------------------");

		Adres adres = new Adres("Koœciuszki", 37, 2, "44-100");
		System.out.println("Kod pocztowy: " + adres.getKodPocztowy());

		// wyœwietlanie
		System.out.println(adres.getKodPocztowy());

		// zmiana wartoœci
		adres.setKodPocztowy("12-312");

		// wyœwietlanie
		System.out.println(adres.getKodPocztowy());

		// tworzenie æwiczêñ
		Adres a1 = new Adres("Koœciuszki", 12, 4, "12-123");
		Wykladowca w1 = new Wykladowca("Marian", "Kowalski", a1);
		Cwiczenia c1 = new Cwiczenia("Java", 12, 13, w1);
		Cwiczenia c2 = new Cwiczenia("Matematyka", 13, 15, w1);

		System.out.println("Nazwa cwiczen: " + c1.getNazwa() + ". Imiê wyk³adowcy: " + c1.getWykladowca().getImie()
				+ ". Adres wyk³adowcy: " + c1.getWykladowca().getAdres().getUlica() + " "
				+ c1.getWykladowca().getAdres().getNumerDomu() + "/"
				+ c1.getWykladowca().getAdres().getNumerMieszkania());
		System.out.println("Nazwa cwiczen: " + c2.getNazwa() + ". Imiê wyk³adowcy: " + c2.getWykladowca().getImie()
				+ ". Adres wyk³adowcy: " + c2.getWykladowca().getAdres().getUlica() + " "
				+ c2.getWykladowca().getAdres().getNumerDomu() + "/"
				+ c2.getWykladowca().getAdres().getNumerMieszkania());

		System.out.println("----------------------------------------------");

		// przekazywanie przez wartoœæ
		int a = 10;

		// przekazywanie przez referencjê
		Liczba l = new Liczba();
		l.a = 10;

		Utils.dodajIWyswietl(a, l);

		System.out.println("Liczba liczba: " + a);
		System.out.println("Liczba l: " + l.a);

		Wykladowca w2 = new Wykladowca("Stefana", "Klawikowski", Utils.stworzAdres());

	}
}
