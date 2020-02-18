package minisklepzadanie;

public class BrakProduktu extends Exception {
	public BrakProduktu() {
		super("Brak produktu w magazynie.");
	}

	public BrakProduktu(String nazwa) {
		super("Brak produktu ( "+ nazwa +" ) w magazynie.");
	}
}
