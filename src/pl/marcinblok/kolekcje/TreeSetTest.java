package pl.marcinblok.kolekcje;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Samochod> zbior = new TreeSet<>(new SamochodComparatorRosnaco());
		zbior.add(new Samochod("BMW", "X3", "czerwony", 2001));
		zbior.add(new Samochod("Fiat", "126p", "czerwony", 2015));
		zbior.add(new Samochod("Opel", "Corsa", "szary", 2000));
		zbior.add(new Samochod("Opel", "Corsa", "¿ó³ty", 2000));
		
		System.out.println(zbior.size());
		System.out.println(zbior);
		
		System.out.println(zbior.ceiling(new Samochod("VW", "Golf", "zielony", 1991)));
		
		TreeSet<Samochod> zbiorMalejaco = new TreeSet<>(new SamochodComparatorMalejaco());
		zbiorMalejaco.addAll(zbior);
		System.out.println(zbiorMalejaco);
		
	}
}
