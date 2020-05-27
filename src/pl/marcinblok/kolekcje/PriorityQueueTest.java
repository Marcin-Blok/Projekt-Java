package pl.marcinblok.kolekcje;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Osoba> k = new PriorityQueue<Osoba>();
		
		
//		ArrayList<Osoba> klasa2 = new ArrayList<>();
//		klasa2.add(new Osoba("Anna"));
//		klasa2.add(new Osoba("Marian"));
//		klasa2.add(new Osoba("Jacek"));
		
//		PriorityQueue<Osoba> kolejka = new PriorityQueue<Osoba>(klasa2);
//		System.out.println(kolejka);
	
		PriorityQueue<Osoba> kolejka = new PriorityQueue<Osoba>(new Osoby2Comparator());
		kolejka.offer(new Osoba("Krystian", Status.STANDAR));
		kolejka.offer(new Osoba("Zenon", Status.WETERAN));
		kolejka.offer(new Osoba("Fabian", Status.NIEPELNOSPRAWNY));
		
		System.out.println(kolejka.poll());
		System.out.println(kolejka.poll());
		System.out.println(kolejka.poll());
		
		
	}
}
