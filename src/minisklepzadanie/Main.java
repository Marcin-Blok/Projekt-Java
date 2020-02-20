package minisklepzadanie;

public class Main {

	public static void main(String[] args) {

		/************************ magazyn ****************/
		Produkt p1 = new Produkt("Kompendium programisty Java. Wydanie IX", 40, 98.50);
		Produkt p2 = new Produkt("Java-Rusz g³ow¹", 35, 70.00);
		Produkt p3 = new Produkt("Java Thinking", 20, 130.00);
		Produkt p4 = new Produkt("Java Kompendium programisty. Wydanie XI", 20, 183.00);

		Produkt[] produktyWMagazynie = new Produkt[4];
		produktyWMagazynie[0] = p1;
		produktyWMagazynie[1] = p2;
		produktyWMagazynie[2] = p3;
		produktyWMagazynie[3] = p4;
		
		Magazyn magazyn = new Magazyn(produktyWMagazynie);

		/*********************** koszyk ********************/
		Produkt[] wybraneProdukty = new Produkt[3];
		wybraneProdukty[0] = new Produkt("Kompendium programisty Java. Wydanie IX", 39, 98.50);
		wybraneProdukty[1] = new Produkt("Java-Rusz g³ow¹", 1, 70.00);
		wybraneProdukty[2] = new Produkt("Java Thinking", 1, 130.00);
//		wybraneProdukty[0] = new Produkt("Kompendium programisty Java. Wydanie IX", 39, 98.50);

		Koszyk koszyk = new Koszyk(wybraneProdukty);
		
		/********************* karta p³atnicza ****************/
		
		KartaPlatnicza kartaPlatnicza = new KartaPlatnicza(555.00);

		try {
//			magazyn.zarezerwujProdukty(koszyk);
			magazyn.sprawdzDostepnosc(koszyk);
			sprawdzCzySaSrodki(koszyk, kartaPlatnicza);

		} catch (BrakProduktu e) {
			System.out.println(e.getMessage());
		}		

	}

	private static void sprawdzCzySaSrodki(Koszyk koszyk, KartaPlatnicza kartaPlatnicza) {
		double kosztProduktowWKoszyku = koszyk.kosztProduktow();
		System.out.println(koszyk.toString() + "\n" + "Ca³kowita kwota do zap³aty wynosi: "
				+ kosztProduktowWKoszyku);
		
		try {
			double stanKonta = kartaPlatnicza.getStanKonta();
			if(kosztProduktowWKoszyku > stanKonta) {
				throw new BrakSrodkow();
			}
			
		} catch (BrakSrodkow e) {
			System.out.println(e.getMessage());
		}
	}

}
