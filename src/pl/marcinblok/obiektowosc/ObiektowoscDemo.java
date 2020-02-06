package pl.marcinblok.obiektowosc;

public class ObiektowoscDemo {
	public static void main(String[] args) {
		System.out.println("------ Obiektowoœæ ------");

		// deklaracja obiektu
		Samochod prywatny;
		// alokacja obiektu
		prywatny = new SamochodOsobowy("zielony", "mercedes", 123_123, 15000.0);
		prywatny.info();

		System.out.println("-------------------");

		Samochod testowy = new SamochodOsobowy();
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
		Adres adres = new Adres("Hutnicza", 2, 2, "22-333");
		Osoba klient1 = new Wykladowca("Marian", "Kowalski",44, "marian.kowalski@wp.pl", adres, 222.33);

		Osoba klient2 = new Student("Ela", "Miotk", 22, "ela.miotk.@wp.pl", adres, 22);

		String tekstPowitania = "Witaj ";
		String znakKoncowy = "!";
		klient1.przywitaj(tekstPowitania, znakKoncowy);
		klient2.przywitaj(tekstPowitania, znakKoncowy);

		System.out.println("----------------------------------------------");

		Adres adres2 = new Adres("Koœciuszki", 37, 2, "44-100");
		System.out.println("Kod pocztowy: " + adres2.getKodPocztowy());

		// wyœwietlanie
		System.out.println(adres.getKodPocztowy());

		// zmiana wartoœci
		adres.setKodPocztowy("12-312");

		// wyœwietlanie
		System.out.println(adres.getKodPocztowy());

		// tworzenie æwiczêñ
		Adres a1 = new Adres("Koœciuszki", 12, 4, "12-123");
		Wykladowca w1 = new Wykladowca("Marian", "Kowalski", 44, "marian.kowalski@wp.pl", a1, 12000);
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

		Wykladowca w2 = new Wykladowca("Stefan", "Klawikowski",44,"stefan.klawikowski@wp.pl", Utils.stworzAdres(), 2200.3);
		
		
		// przyk³ad bazowa -> pochodna
		Osoba osoba1 = w2;
		Student s = Utils.stworzStudenta();
		Osoba osoba2 = s;
		
		System.out.println("Imiê osoby: "+osoba1.getImie());
		System.out.println("Imiê osoby: "+osoba2.getImie());
 		
		
		Utils.przywitaj("Siema ", w2);
		Utils.przywitaj("Siema ", s);
		Utils.przywitaj("Siema ", osoba1);
		
		
		WiecznyStudent wiecznyStudent = new WiecznyStudent("Robert", "Niez³omny", 22, "robert.niezlomny@wp.pl", Utils.stworzAdres(), 1);
		Utils.przywitaj("Dzieñ dobry ", wiecznyStudent);
		
		System.out.println("Czy email w1 jest poprawny? "+w2.czyPoprawnyEmail());
		System.out.println("Czy email s jest poprawny? "+s.czyPoprawnyEmail());
		

		System.out.println(s);
		
		
		// typy sparametryzowane
		Podium<Samochod> podmiumSamochod = new Podium<Samochod>();
		podmiumSamochod.setPierwsze(new SamochodOsobowy("czerwony", "BMW", 222, 1.2));
		podmiumSamochod.setDrugie(new SamochodOsobowy("zielony", "BMW", 222, 1.2));
		podmiumSamochod.setTrzecie(new SamochodOsobowy("niebieski", "BMW", 222, 1.2));
		
		Podium<Student> podiumStudent = new Podium<Student>();
		podiumStudent.setPierwsze(new Student("Marian", "X", 12, "", adres, 2));
		podiumStudent.setDrugie(Utils.stworzStudenta());
		podiumStudent.setTrzecie(new Student("Karol", "Z", 22, "", adres, 12));
		
		
		System.out.println(podiumStudent.getPierwsze().numerAkademika);
		System.out.println(podmiumSamochod.getPierwsze().kolor);
		
		
	}
}
