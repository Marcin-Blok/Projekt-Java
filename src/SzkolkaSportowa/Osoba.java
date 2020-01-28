package SzkolkaSportowa;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
	private String imie;
	private String nazwisko;
	private LocalDate dataUrodzenia;

	// Konstruktor
	public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
	}

	// Gettery i Settery
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public LocalDate getDataurodzenia() {
		return dataUrodzenia;
	}

	public void setDataurodzenia(LocalDate dataurodzenia) {
		this.dataUrodzenia = dataurodzenia;
	}
	
	// Sprawdzanie wieku 
	public void sprawdzWiek(LocalDate dataUrodzenia){
		LocalDate dataDzisiejsza = LocalDate.now();
		Period period = Period.between(dataUrodzenia, dataDzisiejsza);
		
		System.out.println("Wiek to: "+ period.getYears());
	}
}
	