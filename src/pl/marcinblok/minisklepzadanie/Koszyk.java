package pl.marcinblok.minisklepzadanie;

import java.util.Arrays;

public class Koszyk {
	
	private Produkt[] produkty;
	
	public Koszyk() {}


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

	@Override
	public String toString() {
		return "Wybrane produkty " + Arrays.toString(produkty);
	}

	public double kosztProduktow() {
		double koszt = 0;
		for(int i = 0; i < produkty.length; i++) {
			koszt += produkty[i].getIlosc() * produkty[i].getCena();
		}
		return koszt;

	}
}
