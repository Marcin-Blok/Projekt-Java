package pl.marcinblok.szkolkasportowa;

import java.time.LocalDate;

public class Plywak extends Sportowiec {
	private String stylPlywania;
	private double najlepszyCzasWDanymStylu;

	public Plywak(String imie, String nazwisko, LocalDate dataUrodzenia, String dieta, LocalDate dataRozpoczeciaKariery,
			Klub aktualnyKlub, Trener trener, String stylPlywania, double najlepszyCzasWDanymStylu) {
		super(imie, nazwisko, dataUrodzenia, dieta, dataRozpoczeciaKariery, aktualnyKlub, trener);
		this.stylPlywania = stylPlywania;
		this.najlepszyCzasWDanymStylu = najlepszyCzasWDanymStylu;
	}

	public String getStylPlywania() {
		return stylPlywania;
	}

	public void setStylPlywania(String stylPlywania) {
		this.stylPlywania = stylPlywania;
	}

	public double getNajlepszyCzasWDanymStylu() {
		return najlepszyCzasWDanymStylu;
	}

	public void setNajlepszyCzasWDanymStylu(double najlepszyCzasWDanymStylu) {
		this.najlepszyCzasWDanymStylu = najlepszyCzasWDanymStylu;
	}
	
	public void trenuj () {
		System.out.println("Rozpoczynam trening kr�tk� rozgrzewk�, potem p�yn� naprzemiennie kraulem 200m, nast�pnie na grzbiecie 300m potem �abk� 400m, nast�pnie delfinem 250m i ko�cz� trening ponownie kraulem 500m");
	};

}
