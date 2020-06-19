package pl.marcinblok.wyrazenia.stream;

public class Pracownik {
	private String imie;
	private int pensja;

	public Pracownik(String imie, int pensja) {
		super();
		this.imie = imie;
		this.pensja = pensja;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

	@Override
	public String toString() {
		return "Pracownik [imie=" + imie + ", pensja=" + pensja + "]";
	}

}
