package pl.marcinblok.obiektowosc;

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

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public double getPlaca() {
		return placa;
	}

	public void setPlaca(double placa) {
		this.placa = placa;
	}

	public char getPlec() {
		return plec;
	}

	public void setPlec(char plec) {
		this.plec = plec;
	}

	public int getDzial() {
		return dzial;
	}

	public void setDzial(int dzial) {
		this.dzial = dzial;
	}

}
