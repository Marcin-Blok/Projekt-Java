package pl.marcinblok.kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> parametry = new HashMap<>();
		parametry.put("przebieg", "12312312");
		
		parametry.put("kolor", "zielony");
		System.out.println("Jaki kolor? "+parametry.get("kolor"));
		
		parametry.put("kolor", "czarny");
		System.out.println("Jaki kolor? "+parametry.get("kolor"));
		
		parametry.remove("kolor");
		System.out.println("Jaki kolor? "+parametry.get("kolor"));
		
		
		parametry.put("marka", "BMW");
		
		
		Set<Entry<String, String>> zbior = parametry.entrySet();
		for(Entry<String, String> e : zbior) {
			System.out.println("Klucz: "+e.getKey());
			System.out.println("Wartoœæ: "+e.getValue());
		}
		
		
		Set<String> klucze = parametry.keySet();
		Collection<String> wartosci = parametry.values();
		
		for(String klucz : klucze) {
			System.out.println("Klucz: "+klucz);
		}
		
		for(String wartosc : wartosci) {
			System.out.println("Wartosc: "+wartosc);
		}
		
		
		System.out.println(parametry.containsValue("BMW"));
		
		
	}
}
