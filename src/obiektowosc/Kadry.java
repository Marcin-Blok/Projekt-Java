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

	// Metoda dodaj¹ca pracownika do tablicy (je¿eli jest miejsce) która przechowuje
	// dane pracowinków

	public void dodajPracownika(Pracownik pracownik) {
		if (zatrudnienie < pracownicy.length) {
			pracownicy[zatrudnienie] = pracownik;
			zatrudnienie++;
		}
	}

	public void pisz() {
		for (int i = 0; i < pracownicy.length && pracownicy[i] != null; i++) {
			System.out.println(pracownicy[i]);
		}
	}

	public double sredniZarobek() {
		double sum = 0;
		for (Pracownik pracownik : pracownicy) {
			if (pracownik != null) {
				sum += pracownik.getPlaca();
			}
		}

		return sum / zatrudnienie;
	}
	
	public double sredniZarobek(int dzial) {
		double sum = 0;
		int liczbaPracownikowDzialu = 0;
		for (Pracownik pracownik : pracownicy) {
			if (pracownik != null && pracownik.czyPracujeWDziale(dzial)) {
				sum += pracownik.getPlaca();
				liczbaPracownikowDzialu++;
			}
		}

		return sum/liczbaPracownikowDzialu;
	}

}
