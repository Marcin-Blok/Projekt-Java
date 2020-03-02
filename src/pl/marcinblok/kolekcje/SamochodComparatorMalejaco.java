package pl.marcinblok.kolekcje;

import java.util.Comparator;

public class SamochodComparatorMalejaco implements Comparator<Samochod> {

	@Override
	public int compare(Samochod o1, Samochod o2) {
		if (o1.getRocznik() > o2.getRocznik()) {
			return -1;			// dodaj przed
		} else if (o1.getRocznik() == o2.getRocznik()) {
			return o1.getKolor().compareTo(o2.getKolor());  // nie dodawaj
		} else {
			return 1;			// dodaj po
		}
	}

}
