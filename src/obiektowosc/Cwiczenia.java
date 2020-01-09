package obiektowosc;

public class Cwiczenia {
	private String nazwa;
	private int godzinaRozpoczecia;
	private int godzinaZakonczenia;
	private Wykladowca wykladowca;

	Cwiczenia(String nazwa, int godzinaRozpoczecia, int godzinaZakonczenia, Wykladowca wykladowca) {
		this.nazwa = nazwa;
		this.godzinaRozpoczecia = godzinaRozpoczecia;
		this.godzinaZakonczenia = godzinaZakonczenia;
		this.wykladowca = wykladowca;
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

	public Wykladowca getWykladowca() {
		return wykladowca;
	}

	public void setWykladowca(Wykladowca wykladowca) {
		this.wykladowca = wykladowca;
	}

}
