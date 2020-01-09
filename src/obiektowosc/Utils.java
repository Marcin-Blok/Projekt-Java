package obiektowosc;

public class Utils {

	void dodajIWyswietl(int a, Liczba l) {
		a++;
		System.out.println("Liczba a: "+a);
		
		l.a++;
		System.out.println("Liczba l: "+l.a);
	}
	
	// int, double, Adres	
	Adres stworzAdres() {
		Adres adres = new Adres("Mickiewicza", 12, 2, "12-333");
		return adres;
	}
	
	Student stworzStudenta() {
		return new Student("Tomek", "Ziemann");
	}
}
