package pl.marcinblok.wyjatki;

public class Koszyk {
	private Produkt[] produkty;

	public Koszyk(Produkt[] produkty) {
		super();
		this.produkty = produkty;
	}

	public Produkt[] getProdukty() {
		return produkty;
	}

	public void setProdukty(Produkt[] produkty) {
		this.produkty = produkty;
	}

}
