package pl.marcinblok.obiektowosc;

public class Student extends Osoba implements Zawody {
	protected int numerAkademika;

	public Student(String imie, String nazwisko, int wiek, String email, Adres adres, int numerAkademika) {
		super(imie, nazwisko, wiek, email, adres);
		this.numerAkademika = numerAkademika;
	}

	@Override
	public String toString() {
		return getImie() + " " + getNazwisko();
	}
	
	@Override
	public String kimJestem() {
		return " jest studentem.";
	}

}
