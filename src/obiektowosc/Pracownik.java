package obiektowosc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pracownik {
	private String imie;
	private String nazwisko;
	private double placa;
	private char plec;
	private int dzial;

	Pracownik(String imie, String nazwisko, double placa, char plec, int dzial) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.placa = placa;
		this.plec = plec;
		this.dzial = dzial;
	}



	// Nadpisanie metody toString()
	@Override
	public String toString() {
		return ("Dana pracownika " + imie + " " + nazwisko + " " + placa + " " + plec + " " + dzial);
	}

	// Metoda która zwraca true or false zale¿nie od tego czy pracownik jest
	// zatrudniony w danym dziale

	public boolean czyPracujeWDziale(int ktoryDzial) {

		return dzial == ktoryDzial;
	}

}
