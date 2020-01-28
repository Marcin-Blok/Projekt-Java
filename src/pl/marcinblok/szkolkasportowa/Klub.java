package pl.marcinblok.szkolkasportowa;

import java.time.LocalDate;

public class Klub {
	private String nazwa;
	private LocalDate dataZalozenia;

	public Klub(String nazwa, LocalDate dataZalozenia) {
		super();
		this.nazwa = nazwa;
		this.dataZalozenia = dataZalozenia;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public LocalDate getDataZalozenia() {
		return dataZalozenia;
	}

	public void setDataZalozenia(LocalDate dataZalozenia) {
		this.dataZalozenia = dataZalozenia;
	}

}
