package pl.marcinblok.kolekcje;

public class ComparableTest {
	public static void main(String[] args) {
		// .equal - sprawdzenie czy dwa obiekty s� sobie r�wne (true/false)
		// .compareTo(obiekt) - sprawdzenie 3 rzeczy: mniejszy? wi�kszy? r�wny? (-1/0/1)
		
		
		Osoba osoba1 = new Osoba("Marian");
		Osoba osoba2 = new Osoba("Anna");
		
		System.out.println(osoba1.compareTo(osoba2));
	}
}
