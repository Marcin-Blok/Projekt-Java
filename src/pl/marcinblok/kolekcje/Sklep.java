package pl.marcinblok.kolekcje;

import java.util.LinkedList;

public class Sklep {

	private LinkedList<Osoba> kolejka = new LinkedList<Osoba>();

	public void dodajDoKolejki(Osoba o1) {
		switch (o1.getStatus()) {
		case STANDAR: {
			kolejka.addLast(o1);
			break;
		}
		default:
			kolejka.addFirst(o1);
		}
	}
	
	public void obsluzKlienta() {
		System.out.println("Obs³ugujê "+kolejka.poll().getImie());
	}

	public LinkedList<Osoba> getKolejka() {
		return kolejka;
	}
}
