package MiniSklepZadanie;

import MiniSklepZadanie.BrakProduktu;
import MiniSklepZadanie.SprawdzDostepnosc;

public class Main {

	public static void main(String[] args) {
		
		Produkt p1 = new Produkt("Kompendium programisty Java. Wydanie IX", 40, 98.50);
		Produkt p2 = new Produkt("Java-Rusz g³ow¹",35, 70.00 );
		Produkt p3 = new Produkt("Java Thinking", 20, 130.00 );
		Produkt p4 = new Produkt("Java Kompendium programisty. Wydanie XI", 20, 183.00 );
		
		
		Produkt[] magazyn = new Produkt[4];
		magazyn[0] = p1;
		magazyn[1] = p2;
		magazyn[2] = p3;
		magazyn[3] = p4;
		
		
		
		Produkt[] wybraneProdukty = new Produkt[3];
		wybraneProdukty[0] = new Produkt("Kompendium programisty Java", 1, 98.50);		
		wybraneProdukty[1] = new Produkt("Java-Rusz g³ow¹", 1, 70.00);	
		wybraneProdukty[2] = new Produkt("Java Thinking", 1, 130.00);	
		
		
		
		Koszyk koszyk = new Koszyk(wybraneProdukty);

			try {
				SprawdzDostepnosc.sprawdzDostepnosc(magazyn, koszyk);
			} catch (BrakProduktu e) {
				System.out.println(e.getMessage());
			}
	
		
		KartaPlatnicza aktualnyStanKonta = new KartaPlatnicza(150.00);
//		
//		try {
//				KartaPlatnicza.sprawdzStanKonta();
//			} catch (BrakSrodkow e) {
//				System.out.println(e.getMessage());
//			}
		System.out.println(koszyk.toString()+ "\n" + "Ca³kowita kwota do zap³aty wynosi: " + KartaPlatnicza.kosztProduktow(wybraneProdukty));
	

	}

}
