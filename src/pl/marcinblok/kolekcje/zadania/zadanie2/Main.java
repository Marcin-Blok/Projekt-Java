package pl.marcinblok.kolekcje.zadania.zadanie2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Ksiazka ksiazka1 = new Ksiazka("Petitcollin Christel", "Jak mniej my�le�. Dla analizuj�cych bez ko�ca i wysoko wra�liwych", 456, "Twarda ok�adka");
		Ksiazka ksiazka2 = new Ksiazka("Paris B.A", "Dylemat", 203, "Twarda ok�adka");

		ArrayList<Ksiazka> listaKsiazek = new ArrayList<>();
		listaKsiazek.add(ksiazka1);
		listaKsiazek.add(ksiazka2);
		listaKsiazek.add(new Ksiazka("Hemingway Ernest", "Stary cz�owiek i morze", 18, "Audiobook"));
		listaKsiazek.add(new Ksiazka("Haldeman Joe", "Wieczna wojna", 173, "Audiobook"));
		listaKsiazek.add(new Ksiazka("Carter Chris", "Polowanie na z�o", 65, "Twarda ok�adka"));
		
	//	System.out.println(listaKsiazek);
		
		System.out.println("Czy ksi��ka o podanym tytule znajduje si� w bibliotece ? " + listaKsiazek.contains(new Ksiazka("Wieczna wojna")));
	}

}
