package pl.marcinblok.kolekcje;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {		
		LinkedHashSet<Osoba> zamowienia = new LinkedHashSet<Osoba>();
		
		zamowienia.add(new Osoba ("Marian"));
		zamowienia.add(new Osoba ("Karol"));
		zamowienia.add(new Osoba ("Dawid"));
		zamowienia.add(new Osoba ("Dawid"));
		zamowienia.add(new Osoba ("Karol"));
		zamowienia.add(new Osoba ("Fabian"));
		zamowienia.add(new Osoba ("Karol"));
		zamowienia.add(new Osoba ("Dawid"));
		zamowienia.add(new Osoba ("Dawid"));
		
		
		System.out.println(zamowienia);
		for(Osoba osoba : zamowienia) {
			System.out.println("Osb³ugujê zamówienia osoby: "+osoba.getImie());
		}
		
		
		
	}
	
}
