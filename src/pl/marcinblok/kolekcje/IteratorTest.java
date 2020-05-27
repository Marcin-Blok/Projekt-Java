package pl.marcinblok.kolekcje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
	public static void main(String[] args) {
		List<String> imiona = new ArrayList<>();
		imiona.add("Marek");
		imiona.add("Kasia");
		imiona.add("Kasia");
		imiona.add("Kasia");
		imiona.add("Zosia");
		imiona.add("Kasia");
		imiona.add("Kasia");
		imiona.add("Kasia");
		imiona.add("Kasia");
		imiona.add("Kasia");
		
		System.out.println(imiona);
		
		Iterator<String> iterator = imiona.iterator();
		//   Marek, Kasia, Ziosia
//		while(iterator.hasNext()) {
//			String imie = iterator.next();
//			if(imie.equals("Kasia")) {
//				iterator.remove();
//			}
//		}
//		System.out.println(imiona);
		
		
		ListIterator<String> listIterator = imiona.listIterator();
		while(listIterator.hasNext()) {
			String imie = listIterator.next();
			if(imie.equals("Kasia")) {
				listIterator.set("Przemek");
			}
		}
		System.out.println(imiona);
		
		
		List<Integer> liczby = new ArrayList<>();
		liczby.add(-1);
		liczby.add(5);
		liczby.add(-4);
		liczby.add(1);
		liczby.add(-10);
		
		
		System.out.println(liczby);
		ListIterator<Integer> iterate = liczby.listIterator();
		while(iterate.hasNext()) {
			Integer liczba = iterate.next();
			if(liczba < 0) {
				iterate.set(-liczba);
			}
		}
		System.out.println(liczby);
		
	}
}
