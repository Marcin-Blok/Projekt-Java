package MiniSklepZadanie;

public class Magazyn {
	private Produkt[] produkty;
	
	public Magazyn() {}
	
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
	
	

}
