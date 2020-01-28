package SzkolkaSportowa;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
	private String imie;
	private String nazwisko;
	private LocalDate dataurodzenia;

	// Konstruktor
	public Osoba(String imie, String nazwisko, LocalDate dataurodzenia) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataurodzenia = dataurodzenia;
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
		return dataurodzenia;
	}

	public void setDataurodzenia(LocalDate dataurodzenia) {
		this.dataurodzenia = dataurodzenia;
	}
	
	// Sprawdzanie wieku 
	public void ileMaszLat(LocalDate dataUrodzenia){
		LocalDate birthDate = LocalDate.of(1980, 9, 07);
		LocalDate currDate = LocalDate.now();

		Period period = Period.between(birthDate, currDate);
		System.out.println("Od urodzenia minê³o: "+period.getYears() + " lat, "+period.getMonths()+" miesiêcy, "+period.getDays()+" dni.");
	}
}