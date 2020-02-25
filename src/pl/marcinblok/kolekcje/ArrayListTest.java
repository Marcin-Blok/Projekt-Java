package pl.marcinblok.kolekcje;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> imiona = new ArrayList<>();
		
		ArrayList<Osoba> uczniowie = new ArrayList<>();
		uczniowie.add(new Osoba("Karol"));
		uczniowie.add(new Osoba("Jurek"));
		
		System.out.println(uczniowie);
		
		uczniowie.add(1, new Osoba("Damian"));
		
		System.out.println(uczniowie);
		
		ArrayList<Osoba> klasa2 = new ArrayList<>();
		klasa2.add(new Osoba("Anna"));
		klasa2.add(new Osoba("Jacek"));
		
		uczniowie.addAll(klasa2);
		
		System.out.println(uczniowie);
		
		uczniowie.addAll(1, klasa2);

		System.out.println(uczniowie);
		
		// toArray()
		Osoba[] osoby = new Osoba[uczniowie.size()];
		osoby = uczniowie.toArray(osoby);
		
		uczniowie.clear();
		
		System.out.println(uczniowie);
		
		System.out.println("Czy lista jest pusta? "+uczniowie.isEmpty());
		
		
	}
}
