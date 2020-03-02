package pl.marcinblok.kolekcje;

import java.util.Comparator;

public class SamochodComparatorRosnaco implements Comparator<Samochod> {

	@Override
	public int compare(Samochod o1, Samochod o2) {
		if (o1.getRocznik() < o2.getRocznik()) {
			return -1;
		} else if (o1.getRocznik() == o2.getRocznik()) {
			return o1.getKolor().compareTo(o2.getKolor());
		} else {
			return 1;
		}
	}

}
