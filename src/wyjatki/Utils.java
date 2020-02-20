package wyjatki;

public class Utils {

	public static int div(int a, int b) throws ArithmeticException {
		return a / b;
	} 
	
	public static void sprawdzDostepnosc(Produkt[] magazyn, Koszyk koszyk) throws BrakProduktu{
		for(Produkt produktZKoszyka : koszyk.getProdukty()) {
			for(Produkt produktZMagazynu : magazyn) {
				if(produktZMagazynu.getNazwa().equals(produktZKoszyka.getNazwa())) {
					if(produktZKoszyka.getIlosc() > produktZMagazynu.getIlosc()) {
						throw new BrakProduktu(produktZKoszyka.getNazwa());
					}
				}
			}
		}
	}
	
}
