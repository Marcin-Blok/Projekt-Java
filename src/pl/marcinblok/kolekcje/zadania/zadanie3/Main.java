package pl.marcinblok.kolekcje.zadania.zadanie3;

import java.time.LocalDate;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		Zadanie zadanie1 = new Zadanie("Raport sprzeda¿y za styczeñ", "Excell-sprzeda¿ total", LocalDate.now(), LocalDate.of(2020, 02, 01));
		Zadanie zadanie2 = new Zadanie("Rozliczenie podatkowe", "Podatek za 2019", LocalDate.of(2020, 01, 20), LocalDate.of(2020, 04, 30));
		Zadanie zadanie3 = new Zadanie("Przegl¹d samochodu", "Badanie techniczne", LocalDate.of(2019, 06, 18), LocalDate.of(2020, 06, 18));
		Zadanie zadanie4 = new Zadanie("Zebranie wspólnoty mieszkaniowej", "Za³o¿enie monitoringu", LocalDate.of(2020, 02, 21), LocalDate.of(2020, 03, 23));
		
		TreeSet<Zadanie> listaZadan = new TreeSet<>();
		listaZadan.add(zadanie1);
		listaZadan.add(zadanie2);
		listaZadan.add(zadanie3);
		listaZadan.add(zadanie4);
		
		System.out.println("Aktualna data " + data);
		System.out.println("Lista zadañ posortowana od najpilniejszych" + listaZadan);
		
	}
}
