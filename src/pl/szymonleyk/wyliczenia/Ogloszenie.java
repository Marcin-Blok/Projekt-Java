package pl.szymonleyk.wyliczenia;

public class Ogloszenie {
	String tytul;
	String opis;
	TypNieruchomosci typNieruchomosci;

	public Ogloszenie(String tytul, String opis, TypNieruchomosci typNieruchomosci) {
		super();
		this.tytul = tytul;
		this.opis = opis;
		this.typNieruchomosci = typNieruchomosci;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public TypNieruchomosci getTypNieruchomosci() {
		return typNieruchomosci;
	}

	public void setTypNieruchomosci(TypNieruchomosci typNieruchomosci) {
		this.typNieruchomosci = typNieruchomosci;
	}
	
	@Override
	public String toString() {
		return "TYTU£: "+tytul+"\nTYP NIERUCHOMOSCI: "+typNieruchomosci+"\nOPIS:\n"+opis;
	}

}
