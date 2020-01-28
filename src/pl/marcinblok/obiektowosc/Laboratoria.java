package pl.marcinblok.obiektowosc;

public class Laboratoria {
	private String nazwa;
	private int godzinaRozpoczecia;
	private int godzinaZakonczenia;

	Laboratoria(String nazwa, int godzinaRozpoczecia, int godzinaZakonczenia, String tablica) {
		this.nazwa = nazwa;
		this.godzinaRozpoczecia = godzinaRozpoczecia;
		this.godzinaZakonczenia = godzinaZakonczenia;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getGodzinaRozpoczecia() {
		return godzinaRozpoczecia;
	}

	public void setGodzinaRozpoczecia(int godzinaRozpoczecia) {
		this.godzinaRozpoczecia = godzinaRozpoczecia;
	}

	public int getGodzinaZakonczenia() {
		return godzinaZakonczenia;
	}

	public void setGodzinaZakonczenia(int godzinaZakonczenia) {
		this.godzinaZakonczenia = godzinaZakonczenia;
	}

}
