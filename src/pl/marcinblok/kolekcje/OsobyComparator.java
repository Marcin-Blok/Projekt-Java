package pl.marcinblok.kolekcje;

import java.util.Comparator;

public class OsobyComparator implements Comparator<Osoba>{

	@Override
	public int compare(Osoba o1, Osoba o2) {
		return o1.getImie().compareTo(o2.getImie());
	}

}
