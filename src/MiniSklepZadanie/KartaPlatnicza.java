package MiniSklepZadanie;

public class KartaPlatnicza {
	private double stanKonta;
	
	public KartaPlatnicza(double stanKonta) {
		this.stanKonta = stanKonta;
	}

	public double getStanKonta() {
		return stanKonta;
	}
	
	public static double kosztProduktow(Produkt[] wybraneProdukty) {
		double koszt = 0;
		for(int i = 0; i < wybraneProdukty.length; i++) {
			koszt += wybraneProdukty[i].getIlosc() * wybraneProdukty[i].getCena();
		}
		return koszt;

	}
	
	public static void sprawdzStanKonta(KartaPlatnicza aktualnyStanKonta) throws BrakSrodkow{
		{
			throw new BrakSrodkow();
		}
		
	}
}
