package wyjatki;

public class Produkt {
	private String nazwa;
	private int ilosc;

	public Produkt(String nazwa, int ilosc) {
		super();
		this.nazwa = nazwa;
		this.ilosc = ilosc;
	}

	public String getNazwa() {
		return nazwa;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}
