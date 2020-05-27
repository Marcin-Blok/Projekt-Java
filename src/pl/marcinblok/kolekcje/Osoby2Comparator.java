package pl.marcinblok.kolekcje;

import java.util.Comparator;

public class Osoby2Comparator implements Comparator<Osoba>{

	@Override
	public int compare(Osoba o1, Osoba o2) {
		return o1.getStatus().compareTo(o2.getStatus());
	}

}
