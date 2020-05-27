package pl.marcinblok.kolekcje;

import java.util.ArrayList;
import java.util.HashSet;

public class Dealer {
	ArrayList<Samochod> samochody = new ArrayList<Samochod>();
	HashSet<String> modeleSamochodow = new HashSet<String>();
	
	public void dostawa(Samochod samochod) {
		samochody.add(samochod);
		modeleSamochodow.add(samochod.getMarka());
	}

	public ArrayList<Samochod> getSamochody() {
		return samochody;
	}

	public HashSet<String> getModeleSamochodow() {
		return modeleSamochodow;
	}

}
