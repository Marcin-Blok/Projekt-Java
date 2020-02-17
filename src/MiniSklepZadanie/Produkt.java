package MiniSklepZadanie;

public class Produkt {
	private String nazwa;
	private int ilosc;
	private double cena;

	public Produkt(String nazwa, int ilosc, double cena) {
		this.nazwa = nazwa;
		this.ilosc = ilosc;
		this.cena = cena;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return nazwa + ", ilosc " + ilosc + ", cena " + cena;
	}

	
	
	
}
