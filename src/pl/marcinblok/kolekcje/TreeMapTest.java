package pl.marcinblok.kolekcje;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, Osoba> bilety = new TreeMap<>();
		
		bilety.put(12311, new Osoba("Marian"));
		bilety.put(234, new Osoba("Karol"));
		bilety.put(613452, new Osoba("Jarek"));
		bilety.put(8654, new Osoba("Ola"));
		bilety.put(48654, new Osoba("Ola"));
		bilety.put(18654, new Osoba("Ola"));
		
		System.out.println(bilety);

		Entry e = bilety.firstEntry();
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		
		e = bilety.lastEntry();
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		
		bilety.pollLastEntry();
		
		
		TreeMap<String, Integer> uczniowie = new TreeMap<>();
		uczniowie.put("Marylka", 5);
		uczniowie.put("Andrzej", 2);
		uczniowie.put("Andrzej", 7);
		
		System.out.println(uczniowie);
		
	}
}
