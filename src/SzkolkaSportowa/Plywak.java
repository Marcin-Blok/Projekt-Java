package SzkolkaSportowa;

import java.time.LocalDate;

public class Plywak extends Sportowiec {
	private String stylPlywania;
	private double najlepszyCzasWDanymStylu;

	public Plywak(String imie, String nazwisko, LocalDate dataUrodzenia, String dieta, LocalDate dataRozpoczeciaKariery,
			String aktualnyKlub, Trener trener, String stylPlywania, double najlepszyCzasWDanymStylu) {
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
		
	};

}
