package pl.marcinblok.wyrazenia.lambda;

public class Osoba {
	private String imie;
	private int wiek;

	public Osoba(String imie, int wiek) {
		super();
		this.imie = imie;
		this.wiek = wiek;
	}
	
	public Osoba() {}
	
	public Osoba(String imie) {
		this.imie = imie;
	}
	
	public Osoba(int wiek) {
		this.wiek = wiek;
	}
	
	public boolean zwiekszWiek(int wartosc) {
		
		NumericCondition nc = (x) -> {
			wiek += x;
			return true;
		};
		
		return nc.check(wartosc);
	}
	
	public void zmniejszWiek(NumberOperation<? super Integer> no, int wartosc) {
		wiek = no.func(wiek, wartosc);
	}
	
	public void zwiekszWiek() {
		int wartosc = 15; // praktycznie finalna
		// wartosc = 2;  // zmiana wartości spowoduje błąd, ponieważ przestanie byc "praktycznie finalną"
		SimpleInteface si = () -> {
			wiek += wartosc;
		};
		
		si.run();
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", wiek=" + wiek + ", getImie()=" + getImie() + ", getWiek()=" + getWiek()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
