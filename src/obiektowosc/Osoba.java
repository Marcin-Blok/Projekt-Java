package obiektowosc;

public class Osoba {
	String imie;
	String nazwisko;
	int wiek;

	void przywitaj(String tekstPowitania, String znakKoncowy) {
		System.out.println(tekstPowitania + imie + " " + nazwisko + znakKoncowy);
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

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

}
