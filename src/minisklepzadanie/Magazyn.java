package minisklepzadanie;

public class Magazyn {
	private Produkt[] produkty;

	public Magazyn() {
	}

	public Magazyn(Produkt[] produkty) {
		super();
		this.produkty = produkty;
	}

	public Produkt[] getProdukty() {
		return produkty;
	}

	public void setProdukty(Produkt[] produkty) {
		this.produkty = produkty;
	}

	private int liczbaProduktowWMagazynie(Produkt produkt) {
		for (Produkt produktZMagazynu : produkty) {
			if (produktZMagazynu.getNazwa().equals(produkt.getNazwa())) {
				return produktZMagazynu.getIlosc();
			}
		}

		return 0;
	}

	public void sprawdzDostepnosc(Koszyk koszyk) throws BrakProduktu {
		for(Produkt produktZKoszyka : koszyk.getProdukty()) {
			int liczbaPrdotuktoWMagazynie = liczbaProduktowWMagazynie(produktZKoszyka);
			if(liczbaPrdotuktoWMagazynie == 0 || produktZKoszyka.getIlosc() > liczbaPrdotuktoWMagazynie) {
				throw new BrakProduktu();
			}
		}
	}

	public void zarezerwujProdukty(Koszyk koszyk) {
		for(Produkt produktZKoszyka : koszyk.getProdukty()) {
			for(Produkt produktZMagazynu : produkty){
				if(produktZKoszyka.getNazwa().equals(produktZMagazynu.getNazwa())){
					produktZMagazynu.zarezerwuj(produktZKoszyka.getIlosc());
				}
			}
		}
	}

}
