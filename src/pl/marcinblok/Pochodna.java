package pl.marcinblok;

import pl.marcinblok.obiektowosc.Cwiczenia;
import pl.marcinblok.obiektowosc.Wykladowca;

public class Pochodna extends Cwiczenia {

	public Pochodna(String nazwa, int godzinaRozpoczecia, int godzinaZakonczenia, Wykladowca wykladowca) {
		super(nazwa, godzinaRozpoczecia, godzinaZakonczenia, wykladowca);
		// TODO Auto-generated constructor stub
	}
	
	void test() {
		System.out.println(nazwa);
	}
}
