package MiniSklepZadanie;

import MiniSklepZadanie.BrakProduktu;
import MiniSklepZadanie.Koszyk;
import MiniSklepZadanie.Produkt;

public class SprawdzDostepnosc {
	
	public static boolean sprawdzDostepnosc(Produkt[] magazyn, Koszyk koszyk) throws BrakProduktu{
		for(Produkt produktZKoszyka : koszyk.getProdukty()) {
			for(Produkt produktZMagazynu : magazyn) {
				if(produktZMagazynu.getNazwa().equals(produktZKoszyka.getNazwa())) {
					if(produktZKoszyka.getIlosc() > produktZMagazynu.getIlosc()) {
						throw new BrakProduktu(produktZKoszyka.getNazwa());
					}
				}
			}
		}return false;
	}
	
}
