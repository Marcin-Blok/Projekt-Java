package pl.marcinblok.obiektowosc;

public class WiecznyStudent extends Student {
	public static final String status = "WIECZNY";
	
	public WiecznyStudent(String imie, String nazwisko, int wiek, String email, Adres adres, int numerAkademika) {
		super(imie, nazwisko, wiek, email, adres, numerAkademika);
	}

}
