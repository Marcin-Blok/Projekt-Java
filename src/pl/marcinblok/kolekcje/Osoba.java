package pl.marcinblok.kolekcje;

public class Osoba {
	private String imie;

	public Osoba(String imie) {
		super();
		this.imie = imie;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	@Override
	public String toString() {
		return imie;
	}
}
