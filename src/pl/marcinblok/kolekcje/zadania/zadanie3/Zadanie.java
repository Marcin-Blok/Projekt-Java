package pl.marcinblok.kolekcje.zadania.zadanie3;

import java.time.LocalDate;

public class Zadanie implements Comparable<Zadanie>{
	private String tytul;
	private String opis;
	private LocalDate dataDodania;
	private LocalDate deadline;
	
	public Zadanie(String tytul, String opis, LocalDate dataDodania, LocalDate deadline) {
		super();
		this.tytul = tytul;
		this.opis = opis;
		this.dataDodania = dataDodania;
		this.deadline = deadline;
	}

	public String getTytul() {
		return tytul;
	}

	public String getOpis() {
		return opis;
	}
	
	public LocalDate getDataDodania() {
		return dataDodania;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDataDodania(LocalDate dataDodania) {
		this.dataDodania = dataDodania;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}


	@Override
	public String toString() {
		return "Zadanie: " + tytul + ", opis: " + opis + ", dataDodania: " + dataDodania + ", deadline: " + deadline + "\n";
	}

	@Override
	public int compareTo(Zadanie o) {
		return deadline.compareTo(o.getDeadline());
	
	}
	
	
	

}
