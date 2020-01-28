package obiektowosc;

public abstract class Osoba {
	private String imie;
	private String nazwisko;
	private int wiek;
	private String email;
	private Adres adres;
	
	public Osoba(String imie, String nazwisko, int wiek, String email, Adres adres) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.email = email;
		this.adres = adres;
	}
	
	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	void przywitaj(String tekstPowitania, String znakKoncowy) {
		System.out.println(tekstPowitania + imie + " " + nazwisko + znakKoncowy);
	}
	
	public boolean czyPoprawnyEmail() {
		if(email.contains("@")) {
			return true;
		} else {
			return false;
		}
	}
	
	public abstract String kimJestem();

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adres getAdres() {
		return adres;
	}

}
