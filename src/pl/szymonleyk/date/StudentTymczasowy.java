package pl.szymonleyk.date;

import obiektowosc.Adres;
import obiektowosc.Student;

public class StudentTymczasowy extends Student {

	public StudentTymczasowy(String imie, String nazwisko, int wiek, String email, Adres adres, int numerAkademika) {
		super(imie, nazwisko, wiek, email, adres, numerAkademika);
	}

	void info() {
		System.out.println(numerAkademika);
	}
}
