package pl.marcinblok.obiektowosc;

public class Wykladowca extends Osoba {
	private double pensja;
	
	public Wykladowca(String imie, String nazwisko, int wiek, String email, Adres adres, double pensja) {
		super(imie, nazwisko, wiek, email, adres);
		this.pensja = pensja;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}
	
	@Override
	public String kimJestem() {
		return " jest wyk³adowc¹.";
	}
	
}
