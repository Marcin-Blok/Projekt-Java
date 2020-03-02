package pl.marcinblok.kolekcje;

import java.util.ArrayDeque;

public class ArrayDequeTest {
	public static void main(String[] args) {
		ArrayDeque<Samochod> samochody = new ArrayDeque<Samochod>();
		
		samochody.addFirst(new Samochod("Opel", "Corsa", "czerwony"));
		System.out.println(samochody);
		samochody.addLast(new Samochod("Opel2", "Corsa2", "czerwony2"));
		System.out.println(samochody);
		samochody.addFirst(new Samochod("Opel3", "Corsa3", "czerwony3"));
		System.out.println(samochody);
		
		
	}
	
}
