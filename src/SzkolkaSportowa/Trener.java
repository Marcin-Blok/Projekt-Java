package SzkolkaSportowa;

import java.time.LocalDate;

public class Trener extends Osoba {
	private double pensja;
	private String doswiadczenie;

	public Trener(String imie, String nazwisko, LocalDate dataurodzenia, double pensja, String doswiadczenie) {
		super(imie, nazwisko, dataurodzenia);
		this.pensja = pensja;
		this.doswiadczenie = doswiadczenie;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}

	public String getDoswiadczenie() {
		return doswiadczenie;
	}

	public void setDoswiadczenie(String doswiadczenie) {
		this.doswiadczenie = doswiadczenie;
	}

}
