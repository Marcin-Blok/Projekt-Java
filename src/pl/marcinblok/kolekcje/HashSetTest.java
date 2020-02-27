package pl.marcinblok.kolekcje;

public class HashSetTest {
	
	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		
		Samochod s1 = new Samochod("BMW", "X5", "czerwony");
		Samochod s2 = new Samochod("BMW", "X5", "czerwony");		
		Samochod s3 = new Samochod("BMW", "X7", "czerwony");
		Samochod s4 = new Samochod("Fiat", "Stilo", "srebrny");
		Samochod s5 = new Samochod("Fiat", "126p", "zielony");
		
		dealer.dostawa(s1);
		dealer.dostawa(s2);
		dealer.dostawa(s3);
		dealer.dostawa(s4);
		dealer.dostawa(s5);
		
		System.out.println(dealer.getSamochody());
		
		System.out.println(dealer.getModeleSamochodow());
		
	}
}
