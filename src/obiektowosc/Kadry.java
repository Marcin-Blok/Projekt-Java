package obiektowosc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Kadry {
	private Pracownik[] pracownicy;
	private int zatrudnienie;

	Kadry() {
		pracownicy = new Pracownik[100];
		zatrudnienie = 0;
	}

	// Metoda dodaj�ca pracownika do tablicy (je�eli jest miejsce) kt�ra przechowuje
	// dane pracowink�w

	public void dodajPracownika(Pracownik pracownik) {
		if (zatrudnienie < pracownicy.length) {
			pracownicy[zatrudnienie] = pracownik;
			zatrudnienie++;
		}
	}

}
