package pl.marcinblok.kolekcje;

import java.util.ArrayList;
import java.util.List;

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
		
		Osoba os1 = new Osoba("Mariusz");
		System.out.println("Czy Mariusz jest na liœcie? "+uczniowie.contains(os1));

		Osoba os2 = new Osoba("Anna");
		System.out.println("Czy Anna jest na liœcie? "+uczniowie.contains(os2));
		
		ArrayList<Osoba> osoby2 = new ArrayList<Osoba>();
		osoby2.add(new Osoba("Wiktoria"));
		osoby2.add(new Osoba("Anna"));
		
		System.out.println("Czy zawiera wszystkie osoby z osoby2? "+uczniowie.containsAll(osoby2));
		
		System.out.println(uczniowie);
		
		System.out.println(uczniowie.get(3));
		
		List<Osoba> lista =  uczniowie.subList(2, 4);
		
		System.out.println("Pierwszy index obiektu 'Anna': "+uczniowie.indexOf(new Osoba("Anna")));
		System.out.println("Ostatni index obiektu 'Anna': "+uczniowie.lastIndexOf(new Osoba("Anna")));
		
		uczniowie.remove(4);
		
		System.out.println(uczniowie);
		
		uczniowie.set(0, new Osoba("Krystian"));
		
		System.out.println(uczniowie);
		
		uczniowie.ensureCapacity(100);
		
		System.out.println(uczniowie);
		
		uczniowie.clear();
		
		System.out.println(uczniowie);
		
		System.out.println("Czy lista jest pusta? "+uczniowie.isEmpty());
				
	}
}
