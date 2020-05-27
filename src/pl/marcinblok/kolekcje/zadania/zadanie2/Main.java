package pl.marcinblok.kolekcje.zadania.zadanie2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Ksiazka ksiazka1 = new Ksiazka("Petitcollin Christel", "Jak mniej myœleæ. Dla analizuj¹cych bez koñca i wysoko wra¿liwych", 456, "Twarda ok³adka");
		Ksiazka ksiazka2 = new Ksiazka("Paris B.A", "Dylemat", 203, "Twarda ok³adka");

		ArrayList<Ksiazka> listaKsiazek = new ArrayList<>();
		listaKsiazek.add(ksiazka1);
		listaKsiazek.add(ksiazka2);
		listaKsiazek.add(new Ksiazka("Hemingway Ernest", "Stary cz³owiek i morze", 18, "Audiobook"));
		listaKsiazek.add(new Ksiazka("Haldeman Joe", "Wieczna wojna", 173, "Audiobook"));
		listaKsiazek.add(new Ksiazka("Carter Chris", "Polowanie na z³o", 65, "Twarda ok³adka"));
		
	//	System.out.println(listaKsiazek);
		
		System.out.println("Czy ksi¹¿ka o podanym tytule znajduje siê w bibliotece ? " + listaKsiazek.contains(new Ksiazka("Wieczna wojna")));
	}

}
